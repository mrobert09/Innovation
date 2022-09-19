package innovation.card.three;

import innovation.Card;

public class Optics extends Card {

    public Optics() {
        cardName = "Optics";
        topLeftIcon = "Crown";
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = null;
        dogmaIcon = "Crown";
        color = "Red";
        age = 3;
        actions.add("Draw and meld a [3]. If it has a Crown, draw and score a [4]. Otherwise, transfer a card from " +
                "your score pile to the score pile of an opponent with fewer points than you.");
        imgPath = "./src/imgs/three/Optics.jpg";
    }
}
