package innovation.card.one;

import innovation.Card;

public class Archery extends Card {

    public Archery() {
        cardName = "Archery";
        topLeftIcon = "Castle";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Red";
        age = 1;
        actions.add("I DEMAND you draw a [1], then, transfer the highest card from your hand to my hand!");
        imgPath = "./src/imgs/one/Archery.jpg";
    }
}
