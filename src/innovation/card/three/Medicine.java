package innovation.card.three;

import innovation.Card;

public class Medicine extends Card {

    public Medicine() {
        cardName = "Medicine";
        topLeftIcon = "Crown";
        bottomLeftIcon = "Leaf";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = null;
        dogmaIcon = "Leaf";
        color = "Yellow";
        age = 3;
        actions.add("I DEMAND you exchange the highest card in your score pile with the lowest card in my score pile!");
        imgPath = "./src/imgs/three/Medicine.jpg";
    }
}
