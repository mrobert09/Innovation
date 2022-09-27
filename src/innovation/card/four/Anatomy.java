package innovation.card.four;

import innovation.Card;

public class Anatomy extends Card {

    public Anatomy() {
        cardName = "Anatomy";
        topLeftIcon = "Leaf";
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = null;
        dogmaIcon = "Leaf";
        color = "Yellow";
        age = 4;
        actions.add("I DEMAND you return a card from your score pile! If you do, return a top card of equal value " +
                "from your board!");
        imgPath = "./src/imgs/four/Anatomy.jpg";
    }
}
