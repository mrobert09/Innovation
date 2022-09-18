package innovation;

import java.util.ArrayList;

public class Game {
    private final int playerCount;
    Deck deck = new Deck();
    private final ArrayList<Player> playerList = new ArrayList<>();
    private int turn = 1;

    /** Constructor for Game class.
     *
     * @param players Number of players in the game.
     */
    public Game(int players) {
        playerCount = players;
        for (int i = 0; i < playerCount; i++) {
            playerList.add(new Player(deck));
        }
    }

    /**Gets current deck state.
     *
     * @return (eventually) An array of all deck ages. Type Deck.
     */
    public Deck getDeck() {
        return deck;
    }


    /**     Gets player count.
     *
     * @return Int value of number of players.
     */
    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Gets player list.
     * @return Array of player objects.
     */
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    /** Changes player turn.
     *
     */
    public void changeTurn() {
        turn++;
        if (turn > playerCount) {
            turn = 1;
        }
    }
}
