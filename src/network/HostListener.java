package network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class HostListener implements Runnable {

    private final Scanner scanner = new Scanner(System.in);
    private final ObjectOutputStream output;

    public HostListener(ObjectOutputStream output) {
        this.output = output;
    }

    @Override
    public void run() {
        String command;
        do {
            command = scanner.nextLine();
            if (publicMessage(command)) {
                sendMessage(command);
            }
            System.out.println("You said: " + command);
        } while(!command.equals("exit"));
    }

    private boolean publicMessage(String command) {
        String[] splitMessage = command.split(" ");
        return splitMessage[0].equals("say");
    }

    private void sendMessage(String command) {
        String[] splitMessage = command.split(" ");
        StringBuilder messageToSend = new StringBuilder("(Host)");
        for (int i = 1; i < splitMessage.length; i++) {
            messageToSend.append(" ").append(splitMessage[i]);
        }
        try {
            output.writeObject(messageToSend.toString());
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
