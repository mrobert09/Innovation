package innovation.card.one;

import innovation.Card;

public class CityStates extends Card {

    public CityStates() {
        cardName = "City States";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Castle";
        dogmaIcon = "Crown";
        color = "Purple";
        age = 1;
        actions.add("I DEMAND you transfer a top card with a Castle from your board to my board if you have at least " +
                "four Castle on your board! If you do, draw a [1]!");
        imgPath = "./src/imgs/one/CityStates.jpg";
    }

//    public String toString() {
//        String returnString =
//                """
//
//                        +-----------------------------------------------+
//                        | +---+            City States (CRN)            |
//                        | |NUL| +-------------------------------------+ |
//                        | +---+ | I DEMAND you transfer a top card    | |
//                        |       | with a CSL from your board to my    | |
//                        |       | board if you have at least four CSL | |
//                        |       | on your board! If you do, draw a    | |
//                        |       | [1]!                                | |
//                        |       +-------------------------------------+ |
//                        | +---+               +---+               +---+ |
//                        | |CRN|               |CRN|               |CSL| |
//                        | +---+               +---+               +---+ |
//                        +-----------------------------------------------+
//                        """;
//
//        return returnString;
//    }
}
