package innovation.card.one;

import innovation.Card;

public class Metalworking extends Card {

    public Metalworking() {
        cardName = "Metalworking";
        topLeftIcon = "Castle";
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Red";
        age = 1;
        actions.add("Draw and reveal a [1]. If it has a Castle, score it and repeat this dogma effect. Otherwise, " +
                "keep it.");
        imgPath = "./src/imgs/one/Metalworking.jpg";
    }
}
