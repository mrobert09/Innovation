package innovation.card.one;

import innovation.Card;

public class TheWheel extends Card {

    public TheWheel() {
        cardName = "The Wheel";
        topLeftIcon = null;
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = "Castle";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Green";
        age = 1;
        actions.add("Draw two [1]");
    }

    public String toString() {
        String returnString =
                        "+----------------------------------------------+" + "\n" +
                        "| +---+             The Wheel (CSL)            |" + "\n" +
                        "| |NUL|  +-----------------------------------+ |" + "\n" +
                        "| +---+  | Draw two [1]                      | |" + "\n" +
                        "|        +-----------------------------------+ |" + "\n" +
                        "|                                              |" + "\n" +
                        "|                                              |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "| |CSL|             |CSL|             |CSL|    |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "+----------------------------------------------+" + "\n";

        return returnString;
    }
}
