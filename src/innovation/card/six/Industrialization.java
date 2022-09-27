package innovation.card.six;

import innovation.Card;

public class Industrialization extends Card {

    public Industrialization() {
        cardName = "Industrialization";
        topLeftIcon = "Crown";
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Factory";
        bottomRightIcon = null;
        dogmaIcon = "Factory";
        color = "Red";
        age = 6;
        actions.add("Draw and tuck a [6] for every color on your board with one or more Factory.");
        actions.add("You may splay your red or purple cards right.");
        imgPath = "./src/imgs/six/Industrialization.jpg";
    }
}
