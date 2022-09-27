package innovation.card.four;

import innovation.Card;

public class Enterprise extends Card {

    public Enterprise() {
        cardName = "Enterprise";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Purple";
        age = 4;
        actions.add("I DEMAND you transfer a top non-purple card with a Crown from your board to my board! If you " +
                "do, draw and meld a [4].");
        actions.add("You may splay your green cards right.");
        imgPath = "./src/imgs/three/Enterprise.jpg";
    }
}
