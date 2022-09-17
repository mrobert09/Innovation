package innovation.card.one;

import innovation.Card;

public class Archery extends Card {

    public Archery() {
        cardName = "Archery";
        topLeftIcon = "Castle";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Red";
        age = 1;
        actions.add("I demand you draw a [1]! Then, transfer the highest card from your hand to my hand!");
    }

    public String toString() {
        String returnString =
                        "+----------------------------------------------+" + "\n" +
                        "| +---+             Archery (CSL)              |" + "\n" +
                        "| |CSL|  +-----------------------------------+ |" + "\n" +
                        "| +---+  | I DEMAND you draw a [1]. Then     | |" + "\n" +
                        "|        | transfer to my hand your highest  | |" + "\n" +
                        "|        | card.                             | |" + "\n" +
                        "|        +-----------------------------------+ |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "| |LTB|             |NUL|             |CSL|    |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "+----------------------------------------------+" + "\n";

        return returnString;
    }
}
