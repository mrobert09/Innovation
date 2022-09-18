package innovation.card.one;

import innovation.Card;

public class Mysticism extends Card {

    public Mysticism() {
        cardName = "Mysticism";
        topLeftIcon = null;
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Purple";
        age = 1;
        actions.add("Draw and reveal a [1]. If it is the same color as any card on your board, meld it and draw a " +
                "[1].");
        imgPath = "./src/imgs/one/Mysticism.jpg";
    }
}
