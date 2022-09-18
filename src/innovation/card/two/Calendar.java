package innovation.card.two;

import innovation.Card;

public class Calendar extends Card {

    public Calendar() {
        cardName = "Calendar";
        topLeftIcon = null;
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = "Lightbulb";
        dogmaIcon = "Leaf";
        color = "Blue";
        age = 2;
        actions.add("If you have more cards in your score pile than in your hand, draw two [3].");
        imgPath = "./src/imgs/two/Calendar.jpg";
    }
}
