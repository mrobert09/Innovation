package innovation;

import java.util.ArrayList;

public class Card {
    public static String iconTypes[] = {"Castle", "Factory", "Clock", "Lightbulb", "Crown", "Leaf"};
    protected String cardName;
    protected String topLeftIcon;
    protected String bottomLeftIcon;
    protected String bottomMiddleIcon;
    protected String bottomRightIcon;
    protected String dogmaIcon;
    protected String color;
    protected int age;
    protected ArrayList<String> actions = new ArrayList<String>();

    public void displayText() {
        for (String action: actions) {
            System.out.println(action);
        }
    }

    public void displayIcons() {
        System.out.println("Top left icon: " + this.topLeftIcon);
        System.out.println("Bottom left icon: " + this.bottomLeftIcon);
        System.out.println("Bottom middle icon: " + this.bottomMiddleIcon);
        System.out.println("Bottom right icon: " + this.bottomRightIcon);
    }

    public void displayColor() {
        System.out.println("Card color: " + this.color);
    }

    public void displayAge() {
        System.out.println("Card age: " + this.age);
    }

    public void displayDogmaIcon() {
        System.out.println("Card dogma icon: " + this.dogmaIcon);
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public String getDogmaIcon() {
        return this.dogmaIcon;
    }

    /*
                        "+----------------------------------------------+" + "\n" +
                        "| +---+                                        |" + "\n" +
                        "| |   |                                        |" + "\n" +
                        "| +---+                                        |" + "\n" +
                        "|                                              |" + "\n" +
                        "|                                              |" + "\n" +
                        "|                                              |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "| |   |             |   |             |   |    |" + "\n" +
                        "| +---+             +---+             +---+    |" + "\n" +
                        "+----------------------------------------------+";
     */
}
