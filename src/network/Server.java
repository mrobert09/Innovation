package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int port;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;

    public Server(int port) {
        this.port = port;
//        Game game = new Game(2);
    }

    public void runServer() {
        try {
            this.server = new ServerSocket(this.port, 2);
            try {
                waitForConnection();
                setupStreams();
                setupListeners();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void waitForConnection() throws IOException {
        System.out.println("(Host) Waiting for guest to connect...");
        connection = server.accept();
        System.out.println("(Host) Connected to " + connection.getInetAddress().getHostAddress());
    }

    private void setupStreams() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        System.out.println("(Host) Stream connection established.");
    }

    private void setupListeners() {
        HostListener hostListener = new HostListener(output);
        Thread hostThread = new Thread(hostListener);
        hostThread.start();
        ClientListener clientListener = new ClientListener(input, output);
        Thread clientThread = new Thread(clientListener);
        clientThread.start();
    }

//    public void runClientListener() {
//        String command = "";
//        do {
//            try {
//                command = (String) input.readObject();
//                sendCommand("You said: " + command);
//            } catch(ClassNotFoundException | IOException cnf) {
//                System.out.println("Unknown command sent.");
//                break;
//            }
//        } while(!command.equals("exit"));
//    }

    public void sendCommand(String sentCommand) {
        try {
            output.writeObject(sentCommand);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
