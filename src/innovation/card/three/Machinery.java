package innovation.card.three;

import innovation.Card;

public class Machinery extends Card {

    public Machinery() {
        cardName = "Machinery";
        topLeftIcon = "Leaf";
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Leaf";
        color = "Yellow";
        age = 3;
        actions.add("I DEMAND you exchange all the cards in your hand with all the highest cards in my hand!");
        actions.add("Score a card from your hand with a Castle. You may splay your red cards left.");
        imgPath = "./src/imgs/three/Machinery.jpg";
    }
}
