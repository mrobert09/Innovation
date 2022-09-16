package innovation;

import java.util.HashMap;
import java.util.Map;

import innovation.card.one.*;

public class Deck {
//    private ArrayList<Card> onesDeck = new ArrayList<Card>();
    private Map<String, Card> onesDeck = new HashMap<>();
    public Deck() {
        fillDeck();
    }

    public Map<String, Card> getOnes() {
        return onesDeck;
    }

    private void fillDeck() {
        fillOnes();
    }

    private void fillOnes() {
        onesDeck.put("The Wheel", new TheWheel());
        onesDeck.put("Writing", new Writing());
    }
}
