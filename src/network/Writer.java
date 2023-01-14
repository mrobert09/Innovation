package network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Writer implements Runnable {

    private ObjectOutputStream output;
    private String command = "";
    private Scanner scanner = new Scanner(System.in);

    public Writer (ObjectOutputStream output) {
        this.output = output;
    }

    @Override
    public void run() {
        do {
            String commandToSend = scanner.nextLine();
            sendCommand(commandToSend);
        } while (!command.equals("exit"));
    }

    public String getCommand() {
        return command;
    }

    private void sendCommand(String command) {
        try {
            output.writeObject(command);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
