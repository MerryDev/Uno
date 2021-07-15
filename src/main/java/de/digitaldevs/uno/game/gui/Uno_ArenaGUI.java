package de.digitaldevs.uno.game.gui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15.07.2021
 * @author Alexis
 */

public class Uno_ArenaGUI extends JFrame {
  
  public Uno_ArenaGUI() {
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 900;
    int frameHeight = 600;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Uno_ArenaGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);

    // Player names
    JLabel player1Name = new JLabel();
    player1Name.setBounds(370, 520, 150, 20);
    player1Name.setText("Player 1");
    player1Name.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(player1Name);

    JLabel player2Name = new JLabel();
    player2Name.setBounds(30, 280, 150, 20);
    player2Name.setText("Player 2");
    player2Name.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(player2Name);

    JLabel player3Name = new JLabel();
    player3Name.setBounds(370, 21, 150, 20);
    player3Name.setText("Player 3");
    player3Name.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(player3Name);

    JLabel player4Name = new JLabel();
    player4Name.setBounds(706, 280, 150, 20);
    player4Name.setText("Player 4");
    player4Name.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(player4Name);

    // Card stack in the middle
    JLabel cardStackMid = new JLabel();
    cardStackMid.setBounds(400, 240, 90, 97);
    cardStackMid.setText("0");
    cardStackMid.setFont(new Font("Dialog", Font.BOLD, 80));
    cardStackMid.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(cardStackMid);

    setVisible(true);
  }

}

