package innovation.card.one;

import innovation.Card;

public class Oars extends Card {

    public Oars() {
        cardName = "Oars";
        topLeftIcon = "Castle";
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Red";
        age = 1;
        actions.add("I DEMAND you transfer a card with a Crown from your hand to my score pile! If you do, draw a " +
                "[1], and repeat this dogma effect!");
        actions.add("If no cards were transferred due to this demand, draw a [1].");
        imgPath = "./src/imgs/one/Oars.jpg";
    }

//    public String toString() {
//        String returnString =
//                """
//
//                        +-----------------------------------------------+
//                        | +---+              Oars (CSL)                 |
//                        | |CSL| +-------------------------------------+ |
//                        | +---+ | I DEMAND you transfer a card with a | |
//                        |       | CRN from your hand to my score pile!| |
//                        |       | If you do, draw a [1] and repeat!   | |
//                        |       +-------------------------------------+ |
//                        |       | If no cards transferred, draw a [1].| |
//                        | +---+               +---+               +---+ |
//                        | |LTB|               |NUL|               |CSL| |
//                        | +---+               +---+               +---+ |
//                        +-----------------------------------------------+
//                        """;
//
//        return returnString;
//    }
}
