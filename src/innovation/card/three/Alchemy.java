package innovation.card.three;

import innovation.Card;

public class Alchemy extends Card {

    public Alchemy() {
        cardName = "Alchemy";
        topLeftIcon = null;
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Blue";
        age = 3;
        actions.add("Draw and reveal a [4] for every three Castle on your board. If any of the drawn cards are red, " +
                "return the cards drawn and all cards in your hand. Otherwise, keep them.");
        actions.add("Meld a card from your hand, then score a card from your hand.");
        imgPath = "./src/imgs/three/Alchemy.jpg";
    }
}
