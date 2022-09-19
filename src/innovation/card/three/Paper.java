package innovation.card.three;

import innovation.Card;

public class Paper extends Card {

    public Paper() {
        cardName = "Paper";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Crown";
        dogmaIcon = "Lightbulb";
        color = "Green";
        age = 3;
        actions.add("You may splay your green or blue cards left.");
        actions.add("Draw a [4] for every color you have splayed left.");
        imgPath = "./src/imgs/three/Paper.jpg";
    }
}
