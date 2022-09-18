package innovation;

import javax.swing.*;
import java.awt.*;

public class CardViewer {
    private ImageIcon card;
    private JLabel label;

    public CardViewer(String path) {
        JFrame frame = new JFrame();
        frame.setTitle("Card Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(400, 400);

        card = new ImageIcon(path);
        Image resizedCard = card.getImage().getScaledInstance(350, 250, java.awt.Image.SCALE_SMOOTH);
        card = new ImageIcon(resizedCard);
        label = new JLabel(card);
        label.setIcon(card);
        frame.add(label);
        frame.pack();
    }
}
