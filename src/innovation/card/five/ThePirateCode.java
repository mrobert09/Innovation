package innovation.card.five;

import innovation.Card;

public class ThePirateCode extends Card {

    public ThePirateCode() {
        cardName = "The Pirate Code";
        topLeftIcon = "Crown";
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = null;
        dogmaIcon = "Crown";
        color = "Red";
        age = 5;
        actions.add("I DEMAND you transfer two cards of value [4] or less from your score pile to my score pile!");
        actions.add("If any cards were transferred due to the demand, score the lowest top card with a Crown " +
                "from your board.");
        imgPath = "./src/imgs/five/ThePirateCode.jpg";
    }
}
