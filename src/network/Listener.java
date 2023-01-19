package network;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Listener implements Runnable {

    private final ObjectInputStream input;

    public Listener(ObjectInputStream input) {
        this.input = input;
    }

    @Override
    public void run() {
        String command;
        do {
            try {
                command = (String) input.readObject();
                System.out.println(command);
            } catch(ClassNotFoundException | IOException cnf) {
                System.out.println("Unknown command sent.");
                break;
            }
        } while(!command.equals("exit"));
    }
}
