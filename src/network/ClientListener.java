package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientListener implements Runnable {

    private final ObjectInputStream input;
    private final ObjectOutputStream output;

    public ClientListener(ObjectInputStream input, ObjectOutputStream output) {
        this.input = input;
        this.output = output;
    }

    @Override
    public void run() {
        String command;
        do {
            try {
                command = (String) input.readObject();
                if (publicMessage(command)) {
                    displayMessage(command);
                }
                sendCommand("You said: " + command);
            } catch(ClassNotFoundException | IOException cnf) {
                System.out.println("Unknown command sent.");
                break;
            }
        } while(!command.equals("exit"));
    }

    private boolean publicMessage(String command) {
        String[] splitMessage = command.split(" ");
        return splitMessage[0].equals("say");
    }

    private void displayMessage(String command) {
        String[] splitMessage = command.split(" ");
        System.out.print("(Guest)");
        for (int i = 1; i < splitMessage.length; i++) {
            System.out.print(" ");
            System.out.print(splitMessage[i]);
        }
        System.out.print("\n");
    }

    public void sendCommand(String sentCommand) {
        try {
            output.writeObject(sentCommand);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
