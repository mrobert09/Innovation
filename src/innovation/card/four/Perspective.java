package innovation.card.four;

import innovation.Card;

public class Perspective extends Card {

    public Perspective() {
        cardName = "Perspective";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Leaf";
        dogmaIcon = "Lightbulb";
        color = "Yellow";
        age = 4;
        actions.add("You may return a card from your hand. If you do, score a card from your hand for every two " +
                "Lightbulb on your board.");
        imgPath = "./src/imgs/three/Perspective.jpg";
    }
}
