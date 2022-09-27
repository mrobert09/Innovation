package innovation.card.six;

import innovation.Card;

public class Emancipation extends Card {

    public Emancipation() {
        cardName = "Emancipation";
        topLeftIcon = "Factory";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Factory";
        bottomRightIcon = null;
        dogmaIcon = "Factory";
        color = "Purple";
        age = 6;
        actions.add("I DEMAND you transfer a card from your hand to my score pile! If you do, draw a [6]!");
        actions.add("You may splay your red or purple cards to the right.");
        imgPath = "./src/imgs/six/Emancipation.jpg";
    }
}
