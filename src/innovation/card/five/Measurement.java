package innovation.card.five;

import innovation.Card;

public class Measurement extends Card {

    public Measurement() {
        cardName = "Measurement";
        topLeftIcon = "Lightbulb";
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = null;
        dogmaIcon = "Lightbulb";
        color = "Green";
        age = 5;
        actions.add("You may reveal and return a card from your hand. If you do, splay that color of your cards " +
                "right, and draw a card of value equal to the number of cards of that color on your board.");
        imgPath = "./src/imgs/five/Measurement.jpg";
    }
}
