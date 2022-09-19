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

    public int getScore() {
        int score = 0;
        for (Card card : scoreStack) {
            score += card.getAge();
        }
        return score;
    }

    public int getAchievementCount() {
        return achievementStack.size();
    }

    public String getTopCardNames() {
        String returnString = "";
        if (blueStack.size() > 0) {
            returnString += blueStack.get(blueStack.size() - 1).getCardName() + " ";
        }
        if (redStack.size() > 0) {
            returnString += redStack.get(redStack.size() - 1).getCardName() + " ";
        }
        if (yellowStack.size() > 0) {
            returnString += yellowStack.get(yellowStack.size() - 1).getCardName() + " ";
        }
        if (greenStack.size() > 0) {
            returnString += greenStack.get(greenStack.size() - 1).getCardName() + " ";
        }
        if (purpleStack.size() > 0) {
            returnString += purpleStack.get(purpleStack.size() - 1).getCardName() + " ";
        }

        return returnString;
    }
}
