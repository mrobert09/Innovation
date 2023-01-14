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
    private Thread listenThread;
    private Writer writer;
    private Thread writeThread;

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
            while(!listener.getCommand().equals("exit")) {}
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
        listener = new Listener(input, 2);
        listenThread = new Thread(listener);
        listenThread.start();
    }

    private void setupWriter() throws IOException, InterruptedException {
        writer = new Writer(output);
        writeThread = new Thread(writer);
        writeThread.start();
    }

    private void closeConnection() {
        System.out.println("(Client) Closing connection...");
        try {
            writer.sendCommand("exit");
            listenThread.interrupt();
            writeThread.interrupt();
            output.close();
            input.close();
            connection.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
