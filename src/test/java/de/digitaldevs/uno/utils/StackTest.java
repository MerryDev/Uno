package de.digitaldevs.uno.utils;

import de.digitaldevs.uno.game.engine.cards.Card;
import de.digitaldevs.uno.game.engine.cards.NumericCard;
import junit.framework.TestCase;

import java.awt.*;

public class StackTest extends TestCase {

    public void testStack() {
        Stack<Card> cards = new Stack<>();

        cards.push(new ElementWrapper<Card>().setData(new NumericCard(1, Color.YELLOW)));


    }


}