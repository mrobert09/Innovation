package innovation.card.six;

import innovation.Card;

public class MetricSystem extends Card {

    public MetricSystem() {
        cardName = "Metric System";
        topLeftIcon = null;
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Green";
        age = 6;
        actions.add("If your green cards are splayed right, you may splay any one color of your cards right.");
        actions.add("You may splay your green cards right.");
        imgPath = "./src/imgs/six/MetricSystem.jpg";
    }
}
