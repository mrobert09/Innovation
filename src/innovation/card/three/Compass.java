package innovation.card.three;

import innovation.Card;

public class Compass extends Card {

    public Compass() {
        cardName = "Compass";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Leaf";
        dogmaIcon = "Crown";
        color = "Green";
        age = 3;
        actions.add("I DEMAND you transfer a top non-green card with a Leaf from your board to my board, and then " +
                "you transfer a top card without a Leaf from my board to your board!");
        imgPath = "./src/imgs/three/Compass.jpg";
    }
}
