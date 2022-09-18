package innovation.card.two;

import innovation.Card;

public class RoadBuilding extends Card {

    public RoadBuilding() {
        cardName = "Road Building";
        topLeftIcon = "Castle";
        bottomLeftIcon = "Castle";
        bottomMiddleIcon = null;
        bottomRightIcon = "Castle";
        dogmaIcon = "Castle";
        color = "Red";
        age = 2;
        actions.add("Meld one or two cards from your hand. If you melded two, you may transfer your top red card " +
                "to another player's board. If you do, transfer that player's top green card to your board.");
        imgPath = "./src/imgs/two/RoadBuilding.jpg";
    }
}
