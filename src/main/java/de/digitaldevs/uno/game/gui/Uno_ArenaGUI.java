package de.digitaldevs.uno.game.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.07.2021
 * @author Alexis
 */

public class Uno_ArenaGUI extends JFrame {
  // Anfang Attribute
  private JLabel player1Text = new JLabel();
  private JLabel player2Text = new JLabel();
  private JLabel player3Text = new JLabel();
  private JLabel player4Text = new JLabel();
  private JLabel cardStackMid = new JLabel();
  // Ende Attribute
  
  public Uno_ArenaGUI() { 
    // Frame-Initialisierung
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
    
    player1Text.setBounds(374, 482, 110, 20);
    player1Text.setText("");
    cp.add(player1Text);
    player2Text.setBounds(8, 203, 110, 20);
    player2Text.setText("");
    cp.add(player2Text);
    player3Text.setBounds(375, 14, 110, 20);
    player3Text.setText("");
    cp.add(player3Text);
    player4Text.setBounds(745, 202, 110, 20);
    player4Text.setText("");
    cp.add(player4Text);
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

