package innovation.card.four;

import innovation.Card;

public class Reformation extends Card {

    public Reformation() {
        cardName = "Reformation";
        topLeftIcon = "Leaf";
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = null;
        bottomRightIcon = "Leaf";
        dogmaIcon = "Leaf";
        color = "Purple";
        age = 4;
        actions.add("You may tuck a card from your hand for every two Leaf on your board.");
        actions.add("You may splay your yellow or purple cards right.");
        imgPath = "./src/imgs/three/Reformation.jpg";
    }
}
