package innovation.card.five;

import innovation.Card;

public class Societies extends Card {

    public Societies() {
        cardName = "Societies";
        topLeftIcon = "Crown";
        bottomLeftIcon = null;
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Purple";
        age = 5;
        actions.add("I DEMAND you transfer a card with a Lightbulb higher than my top card of the same color from " +
                "your board to my board! If you do, draw a [5].");
        imgPath = "./src/imgs/five/Societies.jpg";
    }
}
