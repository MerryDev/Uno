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

public class Uno_StartGUI extends JFrame {
  // Anfang Attribute
  private JLabel startUnoTitle = new JLabel();
  private JButton bNewgame = new JButton();
  // Ende Attribute
  
  public Uno_StartGUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 378;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Uno_StartGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    startUnoTitle.setBounds(85, 58, 120, 71);
    startUnoTitle.setText("UNO");
    startUnoTitle.setBackground(Color.RED);
    startUnoTitle.setOpaque(true);
    startUnoTitle.setFont(new Font("Arial", Font.BOLD, 50));
    startUnoTitle.setForeground(Color.BLACK);
    startUnoTitle.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(startUnoTitle);
    bNewgame.setBounds(38, 191, 219, 81);
    bNewgame.setText("New game");
    bNewgame.setMargin(new Insets(2, 2, 2, 2));
    bNewgame.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNewgame_ActionPerformed(evt);
      }
    });
    bNewgame.setFont(new Font("Dialog", Font.BOLD, 30));
    cp.add(bNewgame);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Uno_StartGUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Uno_StartGUI();
  } // end of main
  
  public void bNewgame_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bNewgame_ActionPerformed

  // Ende Methoden
} // end of class Uno_StartGUI

