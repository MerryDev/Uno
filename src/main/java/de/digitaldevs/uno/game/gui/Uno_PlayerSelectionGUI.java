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

public class Uno_PlayerSelectionGUI extends JFrame {
  // Anfang Attribute
  private JLabel player1SelectText = new JLabel();
  private JLabel player2SelectText = new JLabel();
  private JLabel player3SelectText = new JLabel();
  private JLabel player4SelectText = new JLabel();
  private JTextField player1SelectTextField = new JTextField();
  private JTextField player2SelectTextField = new JTextField();
  private JTextField player3SelectTextField = new JTextField();
  private JTextField player4SelectTextField = new JTextField();
  private JButton pBot1Button = new JButton();
  private JButton bBot2 = new JButton();
  private JButton bBot3 = new JButton();
  private JButton bBot4 = new JButton();
  private JLabel playerSelectionText = new JLabel();
  private JButton bOk = new JButton();
  private JButton bCancel = new JButton();
  // Ende Attribute
  
  public Uno_PlayerSelectionGUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 378; 
    int frameHeight = 450;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Uno_PlayerSelectionGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    player1SelectText.setBounds(8, 48, 110, 20);
    player1SelectText.setText("Player 1");
    cp.add(player1SelectText);
    player2SelectText.setBounds(8, 112, 110, 20);
    player2SelectText.setText("Player 2");
    cp.add(player2SelectText);
    player3SelectText.setBounds(8, 200, 110, 20);
    player3SelectText.setText("Player 3");
    cp.add(player3SelectText);
    player4SelectText.setBounds(16, 312, 110, 20);
    player4SelectText.setText("Player 4");
    cp.add(player4SelectText);
    player1SelectTextField.setBounds(8, 72, 150, 20);
    cp.add(player1SelectTextField);
    player2SelectTextField.setBounds(8, 136, 150, 20);
    cp.add(player2SelectTextField);
    player3SelectTextField.setBounds(8, 224, 150, 20);
    cp.add(player3SelectTextField);
    player4SelectTextField.setBounds(8, 336, 150, 20);
    cp.add(player4SelectTextField);
    pBot1Button.setBounds(187, 70, 75, 25);
    pBot1Button.setText("Bot 1");
    pBot1Button.setMargin(new Insets(2, 2, 2, 2));
    pBot1Button.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        pBot1Button_ActionPerformed(evt);
      }
    });
    cp.add(pBot1Button);
    bBot2.setBounds(182, 132, 75, 25);
    bBot2.setText("Bot 2");
    bBot2.setMargin(new Insets(2, 2, 2, 2));
    bBot2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBot2_ActionPerformed(evt);
      }
    });
    cp.add(bBot2);
    bBot3.setBounds(179, 219, 75, 25);
    bBot3.setText("Bot 3");
    bBot3.setMargin(new Insets(2, 2, 2, 2));
    bBot3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBot3_ActionPerformed(evt);
      }
    });
    cp.add(bBot3);
    bBot4.setBounds(183, 333, 75, 25);
    bBot4.setText("Bot 4");
    bBot4.setMargin(new Insets(2, 2, 2, 2));
    bBot4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBot4_ActionPerformed(evt);
      }
    });
    cp.add(bBot4);
    playerSelectionText.setBounds(17, 9, 110, 20);
    playerSelectionText.setText("Player Selection");
    cp.add(playerSelectionText);
    bOk.setBounds(277, 373, 75, 25);
    bOk.setText("Ok");
    bOk.setMargin(new Insets(2, 2, 2, 2));
    bOk.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bOk_ActionPerformed(evt);
      }
    });
    cp.add(bOk);
    bCancel.setBounds(191, 375, 75, 25);
    bCancel.setText("Cancel");
    bCancel.setMargin(new Insets(2, 2, 2, 2));
    bCancel.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bCancel_ActionPerformed(evt);
      }
    });
    cp.add(bCancel);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Uno_PlayerSelectionGUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Uno_PlayerSelectionGUI();
  } // end of main
  
  public void pBot1Button_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
    
  } // end of pBot1Button_ActionPerformed

  public void bBot2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
    
  } // end of bBot2_ActionPerformed

  public void bBot3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
    
  } // end of bBot3_ActionPerformed

  public void bBot4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
    
  } // end of bBot4_ActionPerformed

  public void bOk_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
    
  } // end of bOk_ActionPerformed

  public void bCancel_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
    
  } // end of bCancel_ActionPerformed

  // Ende Methoden
} // end of class Uno_PlayerSelectionGUI
