package de.digitaldevs.uno.game.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15.07.2021
 * @author Alexis
 */

public class Uno_PlayerSelectGUI extends JFrame {
  
  public Uno_PlayerSelectGUI() {
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 535; 
    int frameHeight = 560;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Uno_PlayerSelectGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);

    // Title of the player select window
    JLabel lPlayerSelect = new JLabel();
    lPlayerSelect.setBounds(10, 10, 200, 40);
    lPlayerSelect.setText("Player Select");
    lPlayerSelect.setHorizontalAlignment(SwingConstants.CENTER);
    lPlayerSelect.setFont(new Font("Dialog", Font.BOLD, 30));
    cp.add(lPlayerSelect);

    //Player 1
    JLabel player1SelectText = new JLabel();
    player1SelectText.setBounds(20, 80, 50, 20);
    player1SelectText.setText("Player 1");
    cp.add(player1SelectText);

    JTextField player1SelectTextField = new JTextField();
    player1SelectTextField.setBounds(20, 105, 150, 20);
    cp.add(player1SelectTextField);

    JButton bot1PlayerSelectButton = new JButton();
    bot1PlayerSelectButton.setBounds(220, 100, 75, 25);
    bot1PlayerSelectButton.setText("Bot 1");
    bot1PlayerSelectButton.setMargin(new Insets(2, 2, 2, 2));
    bot1PlayerSelectButton.addActionListener(this::bot1PlayerSelectButton_ActionPerformed);
    cp.add(bot1PlayerSelectButton);

    //Player 2
    JLabel player2SelectText = new JLabel();
    player2SelectText.setBounds(20, 170, 110, 20);
    player2SelectText.setText("Player 2");
    cp.add(player2SelectText);

    JTextField player2SelectTextField = new JTextField();
    player2SelectTextField.setBounds(20, 195, 150, 20);
    cp.add(player2SelectTextField);

    JButton bot2PlayerSelectButton = new JButton();
    bot2PlayerSelectButton.setBounds(220, 190, 75, 25);
    bot2PlayerSelectButton.setText("Bot 2");
    bot2PlayerSelectButton.setMargin(new Insets(2, 2, 2, 2));
    bot2PlayerSelectButton.addActionListener(this::bot2PlayerSelectButton_ActionPerformed);
    cp.add(bot2PlayerSelectButton);

    //Player 3
    JLabel player3SelectText = new JLabel();
    player3SelectText.setBounds(20, 260, 110, 20);
    player3SelectText.setText("Player 3");
    cp.add(player3SelectText);

    JTextField player3SelectTextField = new JTextField();
    player3SelectTextField.setBounds(20, 285, 150, 20);
    cp.add(player3SelectTextField);

    JButton bot3PlayerSelectButton = new JButton();
    bot3PlayerSelectButton.setBounds(220, 280, 75, 25);
    bot3PlayerSelectButton.setText("Bot 3");
    bot3PlayerSelectButton.setMargin(new Insets(2, 2, 2, 2));
    bot3PlayerSelectButton.addActionListener(this::bot3PlayerSelectButton_ActionPerformed);
    cp.add(bot3PlayerSelectButton);

    //Player 4
    JLabel player4SelectTextField = new JLabel();
    player4SelectTextField.setBounds(20, 360, 110, 20);
    player4SelectTextField.setText("Player 4");
    cp.add(player4SelectTextField);

    JTextField jTextField4 = new JTextField();
    jTextField4.setBounds(20, 385, 150, 20);
    cp.add(jTextField4);

    JButton bot4PlayerSelectButton = new JButton();
    bot4PlayerSelectButton.setBounds(220, 380, 75, 25);
    bot4PlayerSelectButton.setText("Bot 4");
    bot4PlayerSelectButton.setMargin(new Insets(2, 2, 2, 2));
    bot4PlayerSelectButton.addActionListener(this::bot4PlayerSelectButton_ActionPerformed);
    cp.add(bot4PlayerSelectButton);

    //Buttons
    JButton okButton = new JButton();
    okButton.setBounds(456, 480, 50, 30);
    okButton.setText("ok");
    okButton.setMargin(new Insets(2, 2, 2, 2));
    okButton.addActionListener(this::okButton_ActionPerformed);
    cp.add(okButton);

    JButton cancelButton = new JButton();
    cancelButton.setBounds(376, 480, 75, 30);
    cancelButton.setText("Cancel");
    cancelButton.setMargin(new Insets(2, 2, 2, 2));
    cancelButton.addActionListener(this::cancelButton_ActionPerformed);
    cp.add(cancelButton);
    
    setVisible(true);
  }


  public static void main(String[] args) {
    new Uno_PlayerSelectGUI();
  }
  
  public void bot1PlayerSelectButton_ActionPerformed(ActionEvent evt) {
    
  }

  public void bot2PlayerSelectButton_ActionPerformed(ActionEvent evt) {
    
  }

  public void bot3PlayerSelectButton_ActionPerformed(ActionEvent evt) {
    
  }

  public void bot4PlayerSelectButton_ActionPerformed(ActionEvent evt) {
    
  }

  public void okButton_ActionPerformed(ActionEvent evt) {
    
  }

  public void cancelButton_ActionPerformed(ActionEvent evt) {
    
  }

}

