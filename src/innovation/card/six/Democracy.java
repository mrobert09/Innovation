package innovation.card.six;

import innovation.Card;

public class Democracy extends Card {

    public Democracy() {
        cardName = "Democracy";
        topLeftIcon = "Crown";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = null;
        dogmaIcon = "Lightbulb";
        color = "Purple";
        age = 6;
        actions.add("You may return any number of cards from your hand. If you have returned more cards than any " +
                "opponent due to Democracy so far during this dogma action, draw and score an [8].");
        imgPath = "./src/imgs/six/Democracy.jpg";
    }
}
