package innovation.card.five;

import innovation.Card;

public class Astronomy extends Card {

    public Astronomy() {
        cardName = "Astronomy";
        topLeftIcon = "Crown";
        bottomLeftIcon = "Lightbulb";
        bottomMiddleIcon = "Lightbulb";
        bottomRightIcon = null;
        dogmaIcon = "Lightbulb";
        color = "Purple";
        age = 5;
        actions.add("Draw and reveal a [6]. If the card is green or blue, meld it and repeat this dogma effect.");
        actions.add("If all non-purple top cards on your board are value [6] or higher, claim the Universe " +
                "achievement.");
        imgPath = "./src/imgs/five/Astronomy.jpg";
    }
}
