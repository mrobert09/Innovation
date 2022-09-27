package innovation.card.six;

import innovation.Card;

public class Classification extends Card {

    public Classification() {
        cardName = "Classification";
        topLeftIcon = "Lightbulb";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = null;
        dogmaIcon = "Lightbulb";
        color = "Green";
        age = 6;
        actions.add("Reveal the color of a card from your hand. Take into your hand all cards of that color from " +
                "all opponent's hands. Then, meld all cards of that color from your hand.");
        imgPath = "./src/imgs/six/Classification.jpg";
    }
}
