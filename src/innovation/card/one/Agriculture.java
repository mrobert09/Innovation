package innovation.card.one;

import innovation.Card;

public class Agriculture extends Card {

    public Agriculture() {
        cardName = "Agriculture";
        topLeftIcon = null;
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = "Leaf";
        dogmaIcon = "Leaf";
        color = "Yellow";
        age = 1;
        actions.add("You may return a card from you hand. If you do, draw and score a card of value one higher " +
                "than the card you returned.");
        imgPath = "./src/imgs/one/Agriculture.jpg";
    }
}
