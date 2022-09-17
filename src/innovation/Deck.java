package innovation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import innovation.card.one.*;

public class Deck {
//    private final Map<String, Card> onesDeck = new LinkedHashMap<>();
    private final ArrayList<Card> onesDeck = new ArrayList<>();
    public Deck() {
        fillDeck();
    }

    public ArrayList<Card> getOnes() {
        return onesDeck;
    }

    private void fillDeck() {
        fillOnes();
    }

    private void fillOnes() {
        onesDeck.add(new TheWheel());
        onesDeck.add(new Writing());
        onesDeck.add(new Archery());
        onesDeck.add(new CodeOfLaws());
    }

    public Card drawCard(int age) {
        // Draws a card randomly and then removes it from the deck.
        Card drawnCard = null;
        if (age == 1) {
            Random generator = new Random();
            System.out.println("Current deck length: " + onesDeck.size());
            drawnCard = onesDeck.get(generator.nextInt(onesDeck.size()));
            onesDeck.remove(drawnCard);
        }
        return drawnCard;
    }
}
