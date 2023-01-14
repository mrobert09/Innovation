import network.Client;
import network.Server;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int debug = scanner.nextInt();
        if (debug == 1) {
            Server server = new Server(23456);
            server.runServer();
        } else {
            Client client = new Client("localhost", 23456);
            client.runClient();
        }
//        Game game = new Game(2);
    }
}