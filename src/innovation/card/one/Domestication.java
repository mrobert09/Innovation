package innovation.card.one;

import innovation.Card;

public class Domestication extends Card {

    public Domestication() {
        cardName = "Domestication";
        topLeftIcon = "Castle";
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Yellow";
        age = 1;
        actions.add("Meld the lowest card in your hand. Draw a [1].");
        imgPath = "./src/imgs/one/Domestication.jpg";
    }
}
