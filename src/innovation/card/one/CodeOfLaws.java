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
                "If you do, you may splay that color left.");
    }

    public String toString() {
        String returnString =
                        "+----------------------------------------------+" + "\n" +
                        "| +---+           Code of Laws (LTB)           |" + "\n" +
                        "| |NUL|  +-----------------------------------+ |" + "\n" +
                        "| +---+  | You may tuck a card from your hand| |" + "\n" +
                        "|        | of the same color as on board. If | |" + "\n" +
                        "|        | so, you may splay that color left.| |" + "\n" +
                        "|        +-----------------------------------+ |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "| |CRN|             |CRN|             |LEF|    |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "+----------------------------------------------+" + "\n";

        return returnString;
    }
}
