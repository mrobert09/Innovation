package innovation.card.six;

import innovation.Card;

public class Encyclopedia extends Card {

    public Encyclopedia() {
        cardName = "Encyclopedia";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Blue";
        age = 6;
        actions.add("You may meld all the highest cards in your score pile. If you meld one of the highest, you " +
                "must meld all of the highest.");
        imgPath = "./src/imgs/six/Encyclopedia.jpg";
    }
}
