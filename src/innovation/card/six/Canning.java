package innovation.card.six;

import innovation.Card;

public class Canning extends Card {

    public Canning() {
        cardName = "Canning";
        topLeftIcon = null;
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = "Factory";
        dogmaIcon = "Factory";
        color = "Yellow";
        age = 6;
        actions.add("You may draw and tuck a [6]. If you do, score all your top cards without a Factory.");
        actions.add("You may splay your yellow cards right.");
        imgPath = "./src/imgs/six/Canning.jpg";
    }
}
