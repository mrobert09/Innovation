package innovation;

import innovation.card.five.*;
import innovation.card.four.*;
import innovation.card.one.*;
import innovation.card.three.*;
import innovation.card.two.*;

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

    /**
     * Populates the ones deck with card objects.
     */
    private void fillOnes() {
        onesDeck.add(new Agriculture());
        onesDeck.add(new Archery());
        onesDeck.add(new CityStates());
        onesDeck.add(new Clothing());
        onesDeck.add(new CodeofLaws());
        onesDeck.add(new Domestication());
        onesDeck.add(new Masonry());
        onesDeck.add(new Metalworking());
        onesDeck.add(new Mysticism());
        onesDeck.add(new Oars());
        onesDeck.add(new Pottery());
        onesDeck.add(new Sailing());
        onesDeck.add(new TheWheel());
        onesDeck.add(new Tools());
        onesDeck.add(new Writing());

        decks.add(onesDeck);
    }

    /**
     * Populates the twos deck with card objects.
     */
    private void fillTwos() {
        twosDeck.add(new Calendar());
        twosDeck.add(new CanalBuilding());
        twosDeck.add(new Construction());
        twosDeck.add(new Currency());
        twosDeck.add(new Fermenting());
        twosDeck.add(new Mapmaking());
        twosDeck.add(new Mathematics());
        twosDeck.add(new Monotheism());
        twosDeck.add(new Philosophy());
        twosDeck.add(new RoadBuilding());

        decks.add(twosDeck);
    }

    /**
     * Populates the threes deck with card objects.
     */
    private void fillThrees() {
        threesDeck.add(new Alchemy());
        threesDeck.add(new Compass());
        threesDeck.add(new Education());
        threesDeck.add(new Engineering());
        threesDeck.add(new Feudalism());
        threesDeck.add(new Machinery());
        threesDeck.add(new Medicine());
        threesDeck.add(new Optics());
        threesDeck.add(new Paper());
        threesDeck.add(new Translation());

        decks.add(threesDeck);
    }

    /**
     * Populates the fours deck with card objects.
     */
    private void fillFours() {
        foursDeck.add(new Anatomy());
        foursDeck.add(new Colonialism());
        foursDeck.add(new Enterprise());
        foursDeck.add(new Experimentation());
        foursDeck.add(new Gunpowder());
        foursDeck.add(new Invention());
        foursDeck.add(new Navigation());
        foursDeck.add(new Perspective());
        foursDeck.add(new PrintingPress());
        foursDeck.add(new Reformation());

        decks.add(foursDeck);
    }

    /**
     * Populates the fives deck with card objects.
     */
    private void fillFives() {
        fivesDeck.add(new Astronomy());
        fivesDeck.add(new Banking());
        fivesDeck.add(new Chemistry());
        fivesDeck.add(new Coal());
        fivesDeck.add(new Measurement());
        fivesDeck.add(new Physics());
        fivesDeck.add(new Societies());
        fivesDeck.add(new Statistics());
        fivesDeck.add(new SteamEngine());
        fivesDeck.add(new ThePirateCode());

        decks.add(fivesDeck);
    }

    /**
     * Populates the sixes deck with card objects.
     */
    private void fillSixes() {
        decks.add(sixesDeck);
    }

    /**
     * Populates the sevens deck with card objects.
     */
    private void fillSevens() {
        decks.add(sevensDeck);
    }

    /**
     * Populates the eights deck with card objects.
     */
    private void fillEights() {
        decks.add(eightsDeck);
    }

    /**
     * Populates the nines deck with card objects.
     */
    private void fillNines() {
        decks.add(ninesDeck);
    }

    /**
     * Populates the tens deck with card objects.
     */
    private void fillTens() {
        decks.add(tensDeck);
    }

    /**
     * Populates the achievements deck with card objects.
     */
    private void fillAchieves() {
        achieveDeck.add(draw(1));
        achieveDeck.add(draw(2));
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

    public ArrayList<Card> getDeck(String age) {
        return switch (age) {
            case "1" -> onesDeck;
            case "2" -> twosDeck;
            case "3" -> threesDeck;
            case "4" -> foursDeck;
            case "5" -> fivesDeck;
            case "6" -> sixesDeck;
            case "7" -> sevensDeck;
            case "8" -> eightsDeck;
            case "9" -> ninesDeck;
            case "10" -> tensDeck;
            case "standardAchieve" -> achieveDeck;
            default -> null;
        };
    }

    public int getRemaining(String age) {
        return getDeck(age).size();
    }
}
