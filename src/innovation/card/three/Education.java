package innovation.card.three;

import innovation.Card;

public class Education extends Card {

    public Education() {
        cardName = "Education";
        topLeftIcon = "Lightbulb";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = null;
        dogmaIcon = "Lightbulb";
        color = "Purple";
        age = 3;
        actions.add("You may return the highest card from your score pile. If you do, draw a card of value two " +
                "higher than the highest card remaining in your score pile.");
        imgPath = "./src/imgs/three/Education.jpg";
    }
}
