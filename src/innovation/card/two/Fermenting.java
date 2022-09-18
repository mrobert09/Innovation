package innovation.card.two;

import innovation.Card;

public class Fermenting extends Card {

    public Fermenting() {
        cardName = "Fermenting";
        topLeftIcon = "Leaf";
        bottomLeftIcon = "Left";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Leaf";
        color = "Yellow";
        age = 2;
        actions.add("Draw a [2] for every color on your board with one or more Leaf.");
        imgPath = "./src/imgs/two/Fermenting.jpg";
    }
}
