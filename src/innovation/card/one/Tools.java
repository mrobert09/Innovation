package innovation.card.one;

import innovation.Card;

public class Tools extends Card {

    public Tools() {
        cardName = "Tools";
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Castle";
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 1;
        actions.add("You may return three cards from your hand. If you do, draw and meld a [3].");
        actions.add("You may return a [3] from your hand. If you do, draw three [1].");
        imgPath = "./src/imgs/one/Tools.jpg";
    }

//    public String toString() {
//        String returnString =
//                """
//
//                        +-----------------------------------------------+
//                        | +---+              Tools (LTB)                |
//                        | |NUL| +-------------------------------------+ |
//                        | +---+ | You may return three cards from your| |
//                        |       | hand. If you do, draw and meld a    | |
//                        |       | [3].                                | |
//                        |       +-------------------------------------+ |
//                        |       | You may return a [3] from your hand.| |
//                        |       | If you do, draw three [1].          | |
//                        | +---+               +---+               +---+ |
//                        | |LTB|               |LTB|               |LTB| |
//                        | +---+               +---+               +---+ |
//                        +-----------------------------------------------+
//                        """;
//
//        return returnString;
//    }
}
