package innovation.card.four;

import innovation.Card;

public class PrintingPress extends Card {

    public PrintingPress() {
        cardName = "Printing Press";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Crown";
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 4;
        actions.add("You may return a card from your score pile. If you do, draw a card of value two higher than " +
                "the top purple card on your board.");
        actions.add("You may splay your blue cards right.");
        imgPath = "./src/imgs/three/PrintingPress.jpg";
    }
}
