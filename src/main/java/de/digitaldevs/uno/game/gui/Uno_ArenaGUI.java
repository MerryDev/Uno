package de.digitaldevs.uno.game.gui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.07.2021
 * @author Alexis
 */

public class Uno_ArenaGUI extends JFrame {

  public Uno_ArenaGUI() { 
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 900; 
    int frameHeight = 585;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Uno_ArenaGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten

    // Anfang Attribute
    JLabel player1Text = new JLabel();
    player1Text.setBounds(374, 482, 110, 20);
    player1Text.setText("");
    cp.add(player1Text);
    JLabel player2Text = new JLabel();
    player2Text.setBounds(8, 203, 110, 20);
    player2Text.setText("");
    cp.add(player2Text);
    JLabel player3Text = new JLabel();
    player3Text.setBounds(375, 14, 110, 20);
    player3Text.setText("");
    cp.add(player3Text);
    JLabel player4Text = new JLabel();
    player4Text.setBounds(745, 202, 110, 20);
    player4Text.setText("");
    cp.add(player4Text);
    JLabel cardStackMid = new JLabel();
    cardStackMid.setBounds(414, 199, 90, 90);
    cardStackMid.setText("");
    cardStackMid.setFont(new Font("Dialog", Font.BOLD, 50));
    cp.add(cardStackMid);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Uno_ArenaGUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Uno_ArenaGUI();
  } // end of main
  
  // Ende Methoden
} // end of class Uno_ArenaGUI

