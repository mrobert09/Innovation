package innovation.card.six;

import innovation.Card;

public class Vaccination extends Card {

    public Vaccination() {
        cardName = "Vaccination";
        topLeftIcon = "Leaf";
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = null;
        dogmaIcon = "Leaf";
        color = "Yellow";
        age = 6;
        actions.add("I DEMAND you return all the lowest cards in your score pile! If you returned any, draw and " +
                "meld a [6]!");
        actions.add("If any card was returned as a result of the demand, draw and meld a [7].");
        imgPath = "./src/imgs/six/Vaccination.jpg";
    }
}
