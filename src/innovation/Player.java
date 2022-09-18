package innovation;

import java.util.ArrayList;

public class Player {
    public ArrayList<Card> hand = new ArrayList<>();
    public ArrayList<Card> blueStack = new ArrayList<>();
    public ArrayList<Card> redStack = new ArrayList<>();
    public ArrayList<Card> yellowStack = new ArrayList<>();
    public ArrayList<Card> greenStack = new ArrayList<>();
    public ArrayList<Card> purpleStack = new ArrayList<>();
    public ArrayList<Card> scoreStack = new ArrayList<>();
    public ArrayList<Card> achievementStack = new ArrayList<>();
    private int highestAge = 1;
    Deck deck;

    public Player(Deck passedDeck) {
        deck = passedDeck;
        drawCard();
        drawCard();
    }

    public void drawCard() {
        Card newCard = deck.draw(highestAge);
        hand.add(newCard);
    }

    public void meld(Card card) {
        switch (card.color) {
            case "Blue" -> blueStack.add(card);
            case "Red" -> redStack.add(card);
            case "Yellow" -> yellowStack.add(card);
            case "Green" -> greenStack.add(card);
            case "Purple" -> purpleStack.add(card);
            default -> {
            }
        }
        hand.remove(card);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
