package innovation.card.one;

import innovation.Card;

public class Masonry extends Card {

    public Masonry() {
        cardName = "Masonry";
        topLeftIcon = "Castle";
        bottomLeftIcon = null;
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Yellow";
        age = 1;
        actions.add("You may meld any number of cards from your hand, each with a Castle. IF you melded four or " +
                "more cards in this way, claim the Monument achievement.");
        imgPath = "./src/imgs/one/Masonry.jpg";
    }
}
