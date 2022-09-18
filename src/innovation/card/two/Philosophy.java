package innovation.card.two;

import innovation.Card;

public class Philosophy extends Card {

    public Philosophy() {
        cardName = "Philosophy";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Lightbulb";
        dogmaIcon = "Lightbulb";
        color = "Purple";
        age = 2;
        actions.add("You may splay left any one color of your cards.");
        actions.add("You may score a card from your hand.");
        imgPath = "./src/imgs/two/Philosophy.jpg";
    }
}
