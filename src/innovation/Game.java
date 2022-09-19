package innovation;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private final int playerCount;
    Deck deck = new Deck();
    FileCache filepath = new FileCache();
    private final ArrayList<Player> playerList = new ArrayList<>();
    Player currentPlayer;
    private int turn = 0;
    boolean gameEnd = false;
    Scanner input = new Scanner(System.in);

    /** Constructor for Game class.
     *
     * @param players Number of players in the game.
     */
    public Game(int players) {
        playerCount = players;
        for (int i = 0; i < playerCount; i++) {
            playerList.add(new Player(deck));
        }
        currentPlayer = playerList.get(turn);

        while(!gameEnd) {
            gameLoop();  // starts the main game loop
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
        if (turn == playerCount) {
            turn = 0;
        }
        currentPlayer = playerList.get(turn);
    }

    private void gameLoop() {
        mainMenu();
    }

    private void mainMenu() {
        String[] words;

        System.out.print("\nPlayer " + (turn + 1) + ": ");
        words = input.nextLine().split(" ");

        switch (words[0]) {
            case "draw" -> {
                currentPlayer.drawCard();
                changeTurn();
            }
            case "meld" -> {
                boolean cardInHand = false;
                StringBuilder cardName = new StringBuilder();  // for parsing multi-word card names
                for (int i = 1; i < words.length; i++) {
                    cardName.append(words[i]);
                    cardName.append(" ");
                }
                for (int i = 0; i < currentPlayer.getHand().size(); i++) {
                    // Scans the hand to see if card exists. If so, meld it.
                    if (currentPlayer.getHand().get(i).getCardName().equals(cardName.toString().trim())) {
                        currentPlayer.meld(currentPlayer.getHand().get(i));
                        changeTurn();
                        cardInHand = true;
                        break;
                    }
                }
                if (!cardInHand) {
                    System.out.println("Card not found in hand. Input new choice.");
                }
            }
            case "view" -> {

                switch (words[1]) {
                    case "hand" -> {
                        for (int i = 0; i < currentPlayer.getHand().size(); i++) {
                            System.out.println(currentPlayer.getHand().get(i).getCardName());
                        }
                    }
                    case "deck" -> {
                        if (words.length > 2) {
                            System.out.println("Remaining cards in deck " + words[2] + ": " + deck.getRemaining(words[2]));
                        }
                    }
                    case "achievements" -> {
                        System.out.println("Your achievements: ");
                    }
                    case "card" -> {
                        StringBuilder viewTarget = new StringBuilder();  // for parsing view target
                        for (int i = 2; i < words.length; i++) {
                            viewTarget.append(words[i]);
                            viewTarget.append(" ");
                        }
                        if (filepath.getPath(viewTarget.toString().trim()) != null) {
                            new CardViewer(filepath.getPath(viewTarget.toString().trim()));
                        }
                    }
                    case "board" -> boardDisplay();
                    case "player" -> playerDisplay(words);
                    default -> {}
                }
            }
        }
    }

    /**
     * Handles viewing board data. Prints information out.
     */
    private void boardDisplay() {
        System.out.println("Current board state: ");
        System.out.print("Decks: ");
        for (int i = 1; i < 11; i++) {
            System.out.print("[" + deck.getRemaining(Integer.toString(i)) + "] ");
        }
        System.out.println();
        System.out.print("Available standard achievements: ");
        for (int i = 0; i < deck.getRemaining("standardAchieve"); i++){
            System.out.print(deck.getDeck("standardAchieve").get(i).getAge() + " ");
        }
    }

    /**
     * Handles parsing for viewing player data. Prints information.
     * @param words array of words to be parsed
     */
    private void playerDisplay(String[] words) {
        Player player;
        if (words[2].equals("1")) {
            player = playerList.get(0);
            System.out.println("Player 1 Summary: ");
        } else {
            player = playerList.get(1);
            System.out.println("Player 2 Summary: ");
        }
        if (words.length > 3) {
            switch (words[3]) {
                case "blue" -> {
                    System.out.println("Viewing blue stack. Left-most card on top.");
                    printStackCards(player.blueStack);
                }
                case "red" -> {
                    System.out.println("Viewing red stack. Left-most card on top.");
                    printStackCards(player.redStack);
                }
                case "yellow" -> {
                    System.out.println("Viewing yellow stack. Left-most card on top.");
                    printStackCards(player.yellowStack);
                }
                case "green" -> {
                    System.out.println("Viewing green stack. Left-most card on top.");
                    printStackCards(player.greenStack);
                }
                case "purple" -> {
                    System.out.println("Viewing purple stack. Left-most card on top.");
                    printStackCards(player.purpleStack);
                }
                default -> {}
            }
        } else {
            System.out.println("Score: " + player.getScore());
            System.out.println("Cards in hand: " + player.getHand().size());
            System.out.println("Achievement count: " + player.getAchievementCount());
            System.out.println("Top cards: " + player.getTopCardNames());
            System.out.printf("Total symbols: Crown(%d), Lightbulb(%d), Leaf(%d), " +
                    "Castle(%d), Factory(%d), Clock(%d)", 1, 2, 3, 4, 5, 6);
            System.out.println();
        }
    }

    private void printStackCards (ArrayList<Card> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i).getCardName() + " ");
        }
        System.out.println();
    }
}
