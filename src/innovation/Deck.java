package innovation;

import innovation.card.one.*;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private final ArrayList<ArrayList<Card>> decks = new ArrayList<>();
    private final ArrayList<Card> achieveDeck = new ArrayList<>();
    private final ArrayList<Card> onesDeck = new ArrayList<>();
    private final ArrayList<Card> twosDeck = new ArrayList<>();
    private final ArrayList<Card> threesDeck = new ArrayList<>();
    private final ArrayList<Card> foursDeck = new ArrayList<>();
    private final ArrayList<Card> fivesDeck = new ArrayList<>();
    private final ArrayList<Card> sixesDeck = new ArrayList<>();
    private final ArrayList<Card> sevensDeck = new ArrayList<>();
    private final ArrayList<Card> eightsDeck = new ArrayList<>();
    private final ArrayList<Card> ninesDeck = new ArrayList<>();
    private final ArrayList<Card> tensDeck = new ArrayList<>();
    public Deck() {
        fillDeck();
    }

    private void fillDeck() {
        fillOnes();
        fillTwos();
        fillThrees();
        fillFours();
        fillFives();
        fillSixes();
        fillSevens();
        fillEights();
        fillNines();
        fillTens();
        fillAchieves();
    }

    private void fillOnes() {
        onesDeck.add(new TheWheel());
        onesDeck.add(new Writing());
        onesDeck.add(new Archery());
        onesDeck.add(new CodeOfLaws());
        onesDeck.add(new CityStates());
        onesDeck.add(new Clothing());
        onesDeck.add(new Tools());
        onesDeck.add(new Domestication());
        onesDeck.add(new Oars());


        decks.add(onesDeck);
    }

    private void fillTwos() {
        decks.add(twosDeck);
    }

    private void fillThrees() {
        decks.add(threesDeck);
    }

    private void fillFours() {
        decks.add(foursDeck);
    }

    private void fillFives() {
        decks.add(fivesDeck);
    }

    private void fillSixes() {
        decks.add(sixesDeck);
    }

    private void fillSevens() {
        decks.add(sevensDeck);
    }

    private void fillEights() {
        decks.add(eightsDeck);
    }

    private void fillNines() {
        decks.add(ninesDeck);
    }

    private void fillTens() {
        decks.add(tensDeck);
    }

    private void fillAchieves() {
        achieveDeck.add(draw(1));
    }

    public Card draw(int age) {
        // Draws a card randomly and then removes it from the deck.
        Card drawnCard;
        ArrayList<Card> deck = decks.get(age - 1);
        if (deck.size() == 0) {
            drawnCard = draw(++age);
        } else {
            Random generator = new Random();
            drawnCard = deck.get(generator.nextInt(deck.size()));
            deck.remove(drawnCard);
        }
        return drawnCard;
    }
}
