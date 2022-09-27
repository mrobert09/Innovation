package innovation.card.five;

import innovation.Card;

public class Statistics extends Card {

    public Statistics() {
        cardName = "Statistics";
        topLeftIcon = "Leaf";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = null;
        dogmaIcon = "Leaf";
        color = "Yellow";
        age = 5;
        actions.add("I DEMAND you transfer all the highest cards in your score pile to your hand!");
        actions.add("You may splay your yellow cards right.");
        imgPath = "./src/imgs/five/Statistics.jpg";
    }
}
