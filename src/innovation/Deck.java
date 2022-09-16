package innovation;

import java.util.ArrayList;
import innovation.card.one.*;

public class Deck {
    private ArrayList<Card> onesDeck = new ArrayList<Card>();
    public Deck() {
        fillDeck();
    }

    public ArrayList<Card> getDeck() {
        return onesDeck;
    }

    private void fillDeck() {
        fillOnes();
    }

    private void fillOnes() {
        onesDeck.add(new TheWheel());
        onesDeck.add(new Writing());
    }
}
