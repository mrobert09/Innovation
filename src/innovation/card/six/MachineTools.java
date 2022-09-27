package innovation.card.six;

import innovation.Card;

public class MachineTools extends Card {

    public MachineTools() {
        cardName = "Machine Tools";
        topLeftIcon = "Factory";
        bottomLeftIcon = "Factory";
        bottomMiddleIcon = null;
        bottomRightIcon = "Factory";
        dogmaIcon = "Factory";
        color = "Red";
        age = 6;
        actions.add("Draw and score a card of value equal to the highest card in your score pile.");
        imgPath = "./src/imgs/six/MachineTools.jpg";
    }
}
