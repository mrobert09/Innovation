package network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Writer implements Runnable {

    private final ObjectOutputStream output;
    private final Scanner scanner = new Scanner(System.in);

    public Writer (ObjectOutputStream output) {
        this.output = output;
    }

    @Override
    public void run() {
        String command;
        do {
            command = scanner.nextLine();
            sendCommand(command);
        } while (!command.equals("exit"));
    }

    public void sendCommand(String command) {
        try {
            output.writeObject(command);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
