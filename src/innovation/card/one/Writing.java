package innovation.card.one;

import innovation.Card;

public class Writing extends Card {

    public Writing() {
        cardName = "Writing";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Crown";
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 1;
        actions.add("Draw a [2].");
        imgPath = "./src/imgs/one/Writing.jpg";
    }

//    public String toString() {
//        String returnString =
//                """
//
//                        +-----------------------------------------------+
//                        | +---+              Writing (LTB)              |
//                        | |NUL| +-------------------------------------+ |
//                        | +---+ | Draw a [2].                         | |
//                        |       +-------------------------------------+ |
//                        |                                               |
//                        |                                               |
//                        |                                               |
//                        |                                               |
//                        | +---+               +---+               +---+ |
//                        | |LTB|               |LTB|               |LTB| |
//                        | +---+               +---+               +---+ |
//                        +-----------------------------------------------+
//                        """;
//
//        return returnString;
//    }
}
