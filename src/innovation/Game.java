package innovation;

public class Game {
    private int playerCount;
    Deck deck = new Deck();

    public Game(int players) {
        playerCount = players;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public Deck getDeck() {
        return deck;
    }
}
