import innovation.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(2);

        System.out.println(game.getDeck().getOnes().get("The Wheel"));
    }
}