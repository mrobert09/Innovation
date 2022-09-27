package innovation.card.five;

import innovation.Card;

public class Physics extends Card {

    public Physics() {
        cardName = "Physics";
        topLeftIcon = "Factory";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = null;
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 5;
        actions.add("Draw three [6] and reveal them. If two or more of the drawn cards are the same color, return " +
                "the drawn cards and all cards in your hand. Otherwise, keep them.");
        imgPath = "./src/imgs/five/Physics.jpg";
    }
}
