package de.digitaldevs.uno;

import de.digitaldevs.uno.game.engine.Card;
import de.digitaldevs.uno.utils.ElementWrapper;
import de.digitaldevs.uno.utils.Stack;

import java.awt.*;

/**
 * This class represents the main class for this project.
 *
 * @author Sven
 * @author Alexis
 * @author Alen
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Stack<Card> cards = new Stack<Card>();

        ElementWrapper<Card> card1 = new ElementWrapper<>();
        card1.setData(new Card(1, Color.YELLOW));

        ElementWrapper<Card> card2 = new ElementWrapper<>();
        card2.setData(new Card(2, Color.GREEN));

        ElementWrapper<Card> card3 = new ElementWrapper<>();
        card3.setData(new Card(3, Color.BLUE));

        cards.push(card1);
        cards.push(card2);
        cards.push(card3);

        cards.getContent().forEach(wrapper -> System.out.println(wrapper.getData().number() +  " --> " + wrapper.getNext()));
    }

}
