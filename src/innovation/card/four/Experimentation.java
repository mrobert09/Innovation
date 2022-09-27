package innovation.card.four;

import innovation.Card;

public class Experimentation extends Card {

    public Experimentation() {
        cardName = "Experimentation";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Lightbulb";
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 4;
        actions.add("Draw and meld a [5].");
        imgPath = "./src/imgs/three/Experimentation.jpg";
    }
}
