package innovation.card.one;

import innovation.Card;

public class Writing extends Card {

    public Writing() {
        topLeftIcon = null;
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Crown";
        dogmaIcon = "Lightbulb";
        color = "Blue";
        age = 1;
        actions.add("Draw [2]");
    }

    public String toString() {
        String returnString =
                        "+----------------------------------------------+" + "\n" +
                        "| +---+              Writing (CSL)             |" + "\n" +
                        "| |NUL|  +-----------------------------------+ |" + "\n" +
                        "| +---+  | Draw [2]                          | |" + "\n" +
                        "|        +-----------------------------------+ |" + "\n" +
                        "|                                              |" + "\n" +
                        "|                                              |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "| |LTB|             |LTB|             |LTB|    |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "+----------------------------------------------+" + "\n";

        return returnString;
    }
}
