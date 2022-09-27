package innovation.card.five;

import innovation.Card;

public class Banking extends Card {

    public Banking() {
        cardName = "Banking";
        topLeftIcon = "Factory";
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = null;
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Green";
        age = 5;
        actions.add("I DEMAND you transfer a top non-green card with a Factory from your board to my board. If " +
                        "you do, draw and score a [5]!");
        actions.add("You may splay your green cards right.");
        imgPath = "./src/imgs/five/Banking.jpg";
    }
}
