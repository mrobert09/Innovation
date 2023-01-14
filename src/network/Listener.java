package network;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Listener implements Runnable {

    private ObjectInputStream input;
    private String command = "";
    private String name;

    public Listener(ObjectInputStream input, int entity) {
        this.input = input;
        if (entity == 1) {
            name = "(Client) ";
        } else {
            name = "(Server) ";
        }
    }

    @Override
    public void run() {
        do {
            try {
                command = (String) input.readObject();
                System.out.println(name + command);
            } catch(ClassNotFoundException | IOException cnf) {
                System.out.println(name + "Unknown command sent.");
                break;
            }
        } while(!command.equals("exit"));
    }

    public String getCommand() {
        return command;
    }
}
