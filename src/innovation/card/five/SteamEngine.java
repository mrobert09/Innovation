package innovation.card.five;

import innovation.Card;

public class SteamEngine extends Card {

    public SteamEngine() {
        cardName = "Steam Engine";
        topLeftIcon = null;
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Factory";
        dogmaIcon = "Factory";
        color = "Yellow";
        age = 5;
        actions.add("Draw and tuck two [4], then score your bottom yellow card.");
        imgPath = "./src/imgs/five/SteamEngine.jpg";
    }
}
