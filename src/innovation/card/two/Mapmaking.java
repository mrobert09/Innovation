package innovation.card.two;

import innovation.Card;

public class Mapmaking extends Card {

    public Mapmaking() {
        cardName = "Mapmaking";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Castle";
        dogmaIcon = "Crown";
        color = "Green";
        age = 2;
        actions.add("I DEMAND you transfer a [1] from your score pile, if it has any, to my score pile!");
        actions.add("If any card was transferred due to the demand, draw and score a [1].");
        imgPath = "./src/imgs/two/Mapmaking.jpg";
    }
}
