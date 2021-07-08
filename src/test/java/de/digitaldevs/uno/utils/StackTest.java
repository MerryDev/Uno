package de.digitaldevs.uno.utils;

import de.digitaldevs.uno.game.cards.Card;
import de.digitaldevs.uno.game.cards.NumericCard;
import junit.framework.TestCase;

import java.awt.*;

public class StackTest extends TestCase {

    public static void main(String[] args) {
        Stack<Card> cards = new Stack<>();

        ElementWrapper<Card> wrapper = new ElementWrapper<>();
        wrapper.setData(new NumericCard(1, Color.YELLOW));

        cards.push(wrapper);

        cards.getContent().forEach(cardElementWrapper -> {
            Card card = cardElementWrapper.getData();
            if(card instanceof NumericCard numericCard) {
                System.out.println(numericCard.number() + " --> " + numericCard.color());
            }
        });
    }


}