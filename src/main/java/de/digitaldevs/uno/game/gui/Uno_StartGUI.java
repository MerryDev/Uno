package de.digitaldevs.uno.game.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Beschreibung
 *
 * @author Alexis
 * @version 1.0 vom 15.07.2021
 */

public class Uno_StartGUI extends JFrame {

    public Uno_StartGUI() {
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 800;
        int frameHeight = 640;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Uno_StartGUI");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

        // Button for new game
        JButton bNewGame = new JButton();
        bNewGame.setBounds(300, 250, 200, 50);
        bNewGame.setText("New game");
        bNewGame.setMargin(new Insets(2, 2, 2, 2));
        bNewGame.addActionListener(this::bNewGame_ActionPerformed);
        bNewGame.setFont(new Font("Dialog", Font.BOLD, 30));
        cp.add(bNewGame);

        // Uno title lable
        JLabel startUnoTitle = new JLabel();
        startUnoTitle.setBounds(300, 100, 200, 70);
        startUnoTitle.setText("UNO");
        startUnoTitle.setHorizontalTextPosition(SwingConstants.CENTER);
        startUnoTitle.setHorizontalAlignment(SwingConstants.CENTER);
        startUnoTitle.setFont(new Font("Dialog", Font.BOLD, 50));
        startUnoTitle.setBackground(Color.RED);
        startUnoTitle.setOpaque(true);
        cp.add(startUnoTitle);

        // Copyright label
        JLabel lBySvenAlenAlexis = new JLabel();
        lBySvenAlenAlexis.setBounds(640, 560, 137, 33);
        lBySvenAlenAlexis.setText("By Sven - Alen - Alexis");
        lBySvenAlenAlexis.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(lBySvenAlenAlexis);
        setUndecorated(false);

        setVisible(true);
    }

    public void bNewGame_ActionPerformed(ActionEvent evt) {

    }

}

