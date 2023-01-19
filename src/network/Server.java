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
    private Thread listenThread;
    private Writer writer;
    private Thread writeThread;

    public Server(int port) {
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
                    while(!writer.getCommand().equals("exit")) {}
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
        listener = new Listener(input, 1);
        listenThread = new Thread(listener);
        listenThread.start();
    }

    private void setupWriter() throws IOException, InterruptedException {
        writer = new Writer(output);
        writeThread = new Thread(writer);
        writeThread.start();
    }

    private void closeConnection() {
        System.out.println("(Server) Closing connection...");
        try {
            writer.sendCommand("exit");
            listenThread.interrupt();
            writeThread.interrupt();
            output.close();
            input.close();
            connection.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
