package de.digitaldevs.uno.game.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.07.2021
 * @author Alexis
 */

public class Uno_PlayerSelectionGUI extends JFrame {

  public Uno_PlayerSelectionGUI() { 
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

    // Components

    JLabel player1SelectText = new JLabel();
    player1SelectText.setBounds(8, 48, 110, 20);
    player1SelectText.setText("Player 1");
    cp.add(player1SelectText);
    JLabel player2SelectText = new JLabel();
    player2SelectText.setBounds(8, 112, 110, 20);
    player2SelectText.setText("Player 2");
    cp.add(player2SelectText);
    JLabel player3SelectText = new JLabel();
    player3SelectText.setBounds(8, 200, 110, 20);
    player3SelectText.setText("Player 3");
    cp.add(player3SelectText);
    JLabel player4SelectText = new JLabel();
    player4SelectText.setBounds(16, 312, 110, 20);
    player4SelectText.setText("Player 4");
    cp.add(player4SelectText);
    JTextField player1SelectTextField = new JTextField();
    player1SelectTextField.setBounds(8, 72, 150, 20);
    cp.add(player1SelectTextField);
    JTextField player2SelectTextField = new JTextField();
    player2SelectTextField.setBounds(8, 136, 150, 20);
    cp.add(player2SelectTextField);
    JTextField player3SelectTextField = new JTextField();
    player3SelectTextField.setBounds(8, 224, 150, 20);
    cp.add(player3SelectTextField);
    JTextField player4SelectTextField = new JTextField();
    player4SelectTextField.setBounds(8, 336, 150, 20);
    cp.add(player4SelectTextField);
    JButton pBot1Button = new JButton();
    pBot1Button.setBounds(187, 70, 75, 25);
    pBot1Button.setText("Bot 1");
    pBot1Button.setMargin(new Insets(2, 2, 2, 2));
    pBot1Button.addActionListener(this::pBot1Button_ActionPerformed);
    cp.add(pBot1Button);
    JButton bBot2 = new JButton();
    bBot2.setBounds(182, 132, 75, 25);
    bBot2.setText("Bot 2");
    bBot2.setMargin(new Insets(2, 2, 2, 2));
    bBot2.addActionListener(this::bBot2_ActionPerformed);
    cp.add(bBot2);
    JButton bBot3 = new JButton();
    bBot3.setBounds(179, 219, 75, 25);
    bBot3.setText("Bot 3");
    bBot3.setMargin(new Insets(2, 2, 2, 2));
    bBot3.addActionListener(this::bBot3_ActionPerformed);
    cp.add(bBot3);
    JButton bBot4 = new JButton();
    bBot4.setBounds(183, 333, 75, 25);
    bBot4.setText("Bot 4");
    bBot4.setMargin(new Insets(2, 2, 2, 2));
    bBot4.addActionListener(this::bBot4_ActionPerformed);
    cp.add(bBot4);
    JLabel playerSelectionText = new JLabel();
    playerSelectionText.setBounds(17, 9, 110, 20);
    playerSelectionText.setText("Player Selection");
    cp.add(playerSelectionText);
    JButton bOk = new JButton();
    bOk.setBounds(277, 373, 75, 25);
    bOk.setText("Ok");
    bOk.setMargin(new Insets(2, 2, 2, 2));
    bOk.addActionListener(this::bOk_ActionPerformed);
    cp.add(bOk);
    JButton bCancel = new JButton();
    bCancel.setBounds(191, 375, 75, 25);
    bCancel.setText("Cancel");
    bCancel.setMargin(new Insets(2, 2, 2, 2));
    bCancel.addActionListener(this::bCancel_ActionPerformed);
    cp.add(bCancel);

    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Uno_PlayerSelectionGUI();
  }
  
  public void pBot1Button_ActionPerformed(ActionEvent evt) {

  }

  public void bBot2_ActionPerformed(ActionEvent evt) {
    
  }

  public void bBot3_ActionPerformed(ActionEvent evt) {
    
  }

  public void bBot4_ActionPerformed(ActionEvent evt) {

  }

  public void bOk_ActionPerformed(ActionEvent evt) {
    
  }

  public void bCancel_ActionPerformed(ActionEvent evt) {
    this.setVisible(false);
    
  }

} // end of class Uno_PlayerSelectionGUI

