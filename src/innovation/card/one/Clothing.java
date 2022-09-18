package innovation.card.one;

import innovation.Card;

public class Clothing extends Card {

    public Clothing() {
        cardName = "Clothing";
        topLeftIcon = null;
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Green";
        age = 1;
        actions.add("Meld a card from your hand of a different color from any card on your board.");
        actions.add("Draw and score a [1] for each color present on your board not present on any opponent's board.");
        imgPath = "./src/imgs/one/Clothing.jpg";
    }
}
