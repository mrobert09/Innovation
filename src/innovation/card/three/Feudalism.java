package innovation.card.three;

import innovation.Card;

public class Feudalism extends Card {

    public Feudalism() {
        cardName = "Feudalism";
        topLeftIcon = null;
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Purple";
        age = 3;
        actions.add("I DEMAND you transfer a card with a Castle from your hand to my hand! If you do, unsplay that " +
                "color of your cards!");
        actions.add("You may splay your yellow or purple cards left.");
        imgPath = "./src/imgs/three/Feudalism.jpg";
    }
}
