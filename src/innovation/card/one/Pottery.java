package innovation.card.one;

import innovation.Card;

public class Pottery extends Card {

    public Pottery() {
        cardName = "Pottery";
        topLeftIcon = null;
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = "Leaf";
        dogmaIcon = "Leaf";
        color = "Blue";
        age = 1;
        actions.add("You may return up to three cards from your hand. If you returned any cards, draw and score a " +
                "card of value equal to the number of cards you returned.");
        actions.add("Draw a [1].");
        imgPath = "./src/imgs/one/Pottery.jpg";
    }
}
