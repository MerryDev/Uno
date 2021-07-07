package de.digitaldevs.uno.utils;

import de.digitaldevs.uno.game.engine.Card;

import java.awt.*;

/**
 * @author MerryChrismas
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class StackTest  {

    private static Stack<Card> cards;

    public static void main(String[] args) {
        cards = new Stack<>();
        createYellowCards();

        cards.getContent().forEach(cardElementWrapper -> {
            if(!(cardElementWrapper.getNext() instanceof EndElement)) System.out.println(cardElementWrapper.getData().getNumber() + " --> " + cardElementWrapper.getNext().getData().getNumber());
            else System.out.println(cardElementWrapper.getData().getNumber() + " --> Ende");
        });

        cards.shuffle();

        cards.getContent().forEach(cardElementWrapper -> {
            if(!(cardElementWrapper.getNext() instanceof EndElement)) System.out.println(cardElementWrapper.getData().getNumber() + " --> " + cardElementWrapper.getNext().getData().getNumber());
            else System.out.println(cardElementWrapper.getData().getNumber() + " --> Ende");
        });

    }

    private static void createYellowCards() {

        ElementWrapper<Card> card1 = new ElementWrapper<>();
        card1.setData(new Card(1, Color.YELLOW));

        ElementWrapper<Card> card2 = new ElementWrapper<>();
        card2.setData(new Card(2, Color.GREEN));

        ElementWrapper<Card> card3 = new ElementWrapper<>();
        card3.setData(new Card(3, Color.BLUE));

        cards.push(card1);
        cards.push(card2);
        cards.push(card3);

    }

}