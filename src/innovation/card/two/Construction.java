package innovation.card.two;

import innovation.Card;

public class Construction extends Card {

    public Construction() {
        cardName = "Construction";
        topLeftIcon = "Castle";
        bottomLeftIcon = null;
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Red";
        age = 2;
        actions.add("I DEMAND you transfer two cards from your hand to my hand! Draw a [2]!");
        actions.add("If you are the only player with five top cards, claim the Empire achievement.");
        imgPath = "./src/imgs/two/Construction.jpg";
    }
}
