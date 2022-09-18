import innovation.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(2);
        game.getPlayerList().get(0).getHand().get(0).displayCard();
    }
}