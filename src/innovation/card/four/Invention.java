package innovation.card.four;

import innovation.Card;

public class Invention extends Card {

    public Invention() {
        cardName = "Invention";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Factory";
        dogmaIcon = "Lightbulb";
        color = "Green";
        age = 4;
        actions.add("You may splay right any one color of your cards currently splayed left. If you do, draw and " +
                "score a [4].");
        actions.add("If you have five colors splayed, each in any direction, claim the Wonder achievement.");
        imgPath = "./src/imgs/four/Invention.jpg";
    }
}
