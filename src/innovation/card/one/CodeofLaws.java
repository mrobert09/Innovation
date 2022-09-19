package innovation.card.one;

import innovation.Card;

public class CodeofLaws extends Card {

    public CodeofLaws() {
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
        imgPath = "./src/imgs/one/CodeofLaws.jpg";
    }
}
