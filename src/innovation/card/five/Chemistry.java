package innovation.card.five;

import innovation.Card;

public class Chemistry extends Card {

    public Chemistry() {
        cardName = "Chemistry";
        topLeftIcon = "Factory";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Factory";
        bottomRightIcon = null;
        dogmaIcon = "Factory";
        color = "Blue";
        age = 5;
        actions.add("You may splay your blue cards right.");
        actions.add("Draw and score a card of value one higher than the highest top card on your board and then " +
                "return a card from your score pile.");
        imgPath = "./src/imgs/five/Chemistry.jpg";
    }
}
