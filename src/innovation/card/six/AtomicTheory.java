package innovation.card.six;

import innovation.Card;

public class AtomicTheory extends Card {

    public AtomicTheory() {
        cardName = "Atomic Theory";
        topLeftIcon = "Lightbulb";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = null;
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 6;
        actions.add("You may splay your blue cards right.");
        actions.add("Draw and meld a [7].");
        imgPath = "./src/imgs/six/AtomicTheory.jpg";
    }
}
