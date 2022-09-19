package innovation.card.three;

import innovation.Card;

public class Engineering extends Card {

    public Engineering() {
        cardName = "Engineering";
        topLeftIcon = "Castle";
        bottomLeftIcon = null;
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Red";
        age = 3;
        actions.add("I DEMAND you transfer all top cards with a Castle from yoru board to my score pile.");
        actions.add("You may splay your red cards left.");
        imgPath = "./src/imgs/three/Engineering.jpg";
    }
}
