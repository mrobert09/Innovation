package network;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Socket connection;
    private final String hostIP;
    private final int port;
    private String command = "";
    private Scanner scanner = new Scanner(System.in);
    private Listener listener;
    private Writer writer;

    public Client(String ip, int port) {
        this.hostIP = ip;
        this.port = port;
    }

    public void runClient() {
        try {
            connectToServer();
            setupStreams();
            setupListener();
            setupWriter();
            while(listener.getCommand() != "exit") {}
        } catch(EOFException eof) {
            System.out.println("(Client) EOF exception.");
        } catch(IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection();
        }
    }

    private void connectToServer() throws IOException {
        System.out.println("(Client) Attempting connection...");
        connection = new Socket(InetAddress.getByName(this.hostIP), this.port);
        System.out.println("(Client) Connected to " + connection.getInetAddress().getHostName());
    }

    private void setupStreams() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        System.out.println("(Client) Streams connected.");
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
                // command = (String) input.readObject();
                System.out.println("(Client) Message from server: " + command);
                String commandToSend = scanner.nextLine();
                sendCommand(commandToSend);
                command = (String) input.readObject();
            } catch(ClassNotFoundException cnf) {
                System.out.println("(Client) Don't recognize object type.");
            }
        } while (!command.equals("exit"));
    }

    private void closeConnection() {
        System.out.println("(Client) Closing connection...");
        try {
            output.close();
            input.close();
            connection.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendCommand(String command) {
        try {
            output.writeObject("Writing: " + command);
            output.flush();
            System.out.println("Sent: " + command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
