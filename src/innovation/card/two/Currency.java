package innovation.card.two;

import innovation.Card;

public class Currency extends Card {

    public Currency() {
        cardName = "Currency";
        topLeftIcon = "Leaf";
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = null;
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Green";
        age = 2;
        actions.add("You may return any number of cards from your hand. If you do, draw and score a [2] for every " +
                "different value of card you returned.");
        imgPath = "./src/imgs/two/Currency.jpg";
    }
}
