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


    public Client(String ip, int port) {
        this.hostIP = ip;
        this.port = port;
    }

    public void runClient() {
        try {
            connectToServer();
            setupStreams();
            setupThreads();
        } catch(EOFException eof) {
            System.out.println("(Client) EOF exception.");
        } catch(IOException e) {
            e.printStackTrace();
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

    private void setupThreads() {
        Listener listener = new Listener(input);
        Thread listenThread = new Thread(listener);
        listenThread.start();

        Writer writer = new Writer(output);
        Thread writeThread = new Thread(writer);
        writeThread.start();
    }
}
