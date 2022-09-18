package innovation.card.one;

import innovation.Card;

public class TheWheel extends Card {

    public TheWheel() {
        cardName = "The Wheel";
        topLeftIcon = null;
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Green";
        age = 1;
        actions.add("Draw two [1].");
        imgPath = "./src/imgs/one/TheWheel.jpg";
    }
}
