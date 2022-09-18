package innovation.card.one;

import innovation.Card;

public class Sailing extends Card {

    public Sailing() {
        cardName = "Sailing";
        topLeftIcon = "Crown";
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = null;
        bottomRightIcon = "Leaf";
        dogmaIcon = "Crown";
        color = "Green";
        age = 1;
        actions.add("Draw and meld a [1].");
        imgPath = "./src/imgs/one/Sailing.jpg";
    }
}
