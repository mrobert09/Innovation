package innovation.card.two;

import innovation.Card;

public class Monotheism extends Card {

    public Monotheism() {
        cardName = "Monotheism";
        topLeftIcon = null;
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Purple";
        age = 2;
        actions.add("I DEMAND you transfer a top card on your board of a different color from any card on my board " +
                "to my score pile! If you do, draw and tuck a [1]!");
        actions.add("Draw and tuck a [1].");
        imgPath = "./src/imgs/two/Monotheism.jpg";
    }
}
