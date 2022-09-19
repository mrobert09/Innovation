package innovation.card.three;

import innovation.Card;

public class Translation extends Card {

    public Translation() {
        cardName = "Translation";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Blue";
        age = 3;
        actions.add("You may meld all the cards in your score pile. If you meld one, you must meld them all.");
        actions.add("If each top card on your board has a Crown, claim the World achievement.");
        imgPath = "./src/imgs/three/Translation.jpg";
    }
}
