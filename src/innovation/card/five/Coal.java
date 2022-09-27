package innovation.card.five;

import innovation.Card;

public class Coal extends Card {

    public Coal() {
        cardName = "Coal";
        topLeftIcon = "Factory";
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Factory";
        bottomRightIcon = null;
        dogmaIcon = "Factory";
        color = "Red";
        age = 5;
        actions.add("Draw and tuck a [5].");
        actions.add("You may splay your red cards right.");
        actions.add("You may score any one of your top cards. If you do, also score the card beneath it.");
        imgPath = "./src/imgs/five/Coal.jpg";
    }
}
