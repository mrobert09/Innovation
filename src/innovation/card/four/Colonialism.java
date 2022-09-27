package innovation.card.four;

import innovation.Card;

public class Colonialism extends Card {

    public Colonialism() {
        cardName = "Colonialism";
        topLeftIcon = null;
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Factory";
        dogmaIcon = "Factory";
        color = "Red";
        age = 4;
        actions.add("Draw and tuck a [3]. If it has a Crown, repeat this dogma effect.");
        imgPath = "./src/imgs/four/Colonialism.jpg";
    }
}
