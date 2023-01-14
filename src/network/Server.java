package network;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;
    private String command = "";
    private Listener listener;
    private Writer writer;

    public Server(int port) throws IOException {
        this.port = port;
    }

    public void runServer() throws IOException {
        try {
            this.server = new ServerSocket(this.port, 2);
            while (true) {
                try {
                    waitForConnection();
                    setupStreams();
                    setupListener();
                    setupWriter();
                    while(listener.getCommand() != "exit") {}
                    //whileConnected();
                } catch (EOFException | InterruptedException eof) {
                    System.out.println("Server closed.");
                } finally {
                    closeConnection();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void waitForConnection() throws IOException {
        System.out.println("(Server) Waiting for player to connect...");
        connection = server.accept();
        System.out.println("(Server) Connected to " + connection.getInetAddress().getHostAddress());
    }

    private void setupStreams() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        System.out.println("(Server) Stream connection established.");
    }

    private void setupListener() throws IOException, InterruptedException {
        listener = new Listener(input);
        Thread listenThread = new Thread(listener);
        listenThread.start();
    }

    private void setupWriter() throws IOException, InterruptedException {
        writer = new Writer(output);
        Thread writeThread = new Thread(writer);
        writeThread.start();
    }

    private void whileConnected() throws IOException {
        do {
            try {
                command = (String) input.readObject();
                System.out.println("(Server) Received command: " + command);
                // command = (String) input.readObject();
            } catch(ClassNotFoundException cnf) {
                System.out.println("(Server) Unknown command sent.");
            }
        } while(!command.equals("exit"));
    }

    private void closeConnection() {
        System.out.println("(Server) Closing connection...");
        try {
            output.close();
            input.close();
            connection.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
