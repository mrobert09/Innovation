package network;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Listener implements Runnable {

    private ObjectInputStream input;
    private String command = "";

    public Listener(ObjectInputStream input) {
        this.input = input;
    }

    @Override
    public void run() {
        do {
            try {
                command = (String) input.readObject();
                System.out.println("(Server) Received command: " + command);
            } catch(ClassNotFoundException | IOException cnf) {
                System.out.println("(Server) Unknown command sent.");
            }
        } while(!command.equals("exit"));
    }

    public String getCommand() {
        return command;
    }
}
