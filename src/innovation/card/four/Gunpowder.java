package innovation.card.four;

import innovation.Card;

public class Gunpowder extends Card {

    public Gunpowder() {
        cardName = "Gunpowder";
        topLeftIcon = null;
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = "Crown";
        bottomRightIcon = "Factory";
        dogmaIcon = "Factory";
        color = "Red";
        age = 4;
        actions.add("I DEMAND you transfer a top card with a Castle from your board to my score pile!");
        actions.add("If any card was transferred due to the demand, draw and score a [2].");
        imgPath = "./src/imgs/three/Gunpowder.jpg";
    }
}
