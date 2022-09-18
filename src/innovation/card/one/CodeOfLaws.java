package innovation.card.one;

import innovation.Card;

public class CodeOfLaws extends Card {

    public CodeOfLaws() {
        cardName = "Code of Laws";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Leaf";
        dogmaIcon = "Lightbulb";
        color = "Purple";
        age = 1;
        actions.add("You may tuck a card from your hand of the same color as any card on your board. " +
                "If you do, you may splay that color of your cards left.");
        imgPath = "./src/imgs/one/CodeOfLaws.jpg";
    }

//    public String toString() {
//        String returnString =
//                """
//
//                        +-----------------------------------------------+
//                        | +---+           Code of Laws (LTB)            |
//                        | |NUL| +-------------------------------------+ |
//                        | +---+ | You may tuck a card from your hand  | |
//                        |       | of the same color as any card on    | |
//                        |       | your board. If you do, you may      | |
//                        |       | splay that color of your cards left.| |
//                        |       +-------------------------------------+ |
//                        |                                               |
//                        | +---+               +---+               +---+ |
//                        | |CRN|               |CRN|               |LEF| |
//                        | +---+               +---+               +---+ |
//                        +-----------------------------------------------+
//                        """;
//
//        return returnString;
//    }
}
