package innovation.card.two;

import innovation.Card;

public class CanalBuilding extends Card {

    public CanalBuilding() {
        cardName = "Canal Building";
        topLeftIcon = null;
        bottomLeftIcon = "Crown";
        bottomMiddleIcon = "Leaf";
        bottomRightIcon = "Crown";
        dogmaIcon = "Crown";
        color = "Yellow";
        age = 2;
        actions.add("You may exchange all the highest cards in your hand with all the highest cards in your score " +
                "pile.");
        imgPath = "./src/imgs/two/CanalBuilding.jpg";
    }
}
