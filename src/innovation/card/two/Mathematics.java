package innovation.card.two;

import innovation.Card;

public class Mathematics extends Card {

    public Mathematics() {
        cardName = "Mathematics";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Lightbulb";
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 2;
        actions.add("You may return a card from your hand. If you do, draw and meld a card of value one higher " +
                "than the card you returned.");
        imgPath = "./src/imgs/two/Mathematics.jpg";
    }
}
