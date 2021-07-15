package de.digitaldevs.uno.utils;

import de.digitaldevs.uno.game.engine.cards.Card;
import de.digitaldevs.uno.game.engine.cards.NumericCard;
import de.digitaldevs.uno.game.engine.cards.SpecialCard;
import de.digitaldevs.uno.game.engine.cards.SpecialCardType;
import junit.framework.TestCase;

import java.awt.*;
import java.util.Collections;
import java.util.Iterator;

public class StackTest extends TestCase {

    private final Stack<Card> cards = new Stack<>();

    public void testStack() {
        testPush();
        testShuffle();
    }

    public void testPush() {
        cards.push(new ElementWrapper<Card>().setData(new NumericCard(1, Color.YELLOW)));
        cards.push(new ElementWrapper<Card>().setData(new SpecialCard(SpecialCardType.PLUS_FOUR_WILD, Color.BLACK)));
        cards.push(new ElementWrapper<Card>().setData(new NumericCard(12, Color.GREEN)));
    }

    public void testShuffle() {
        cards.shuffle();
    }

    public void testIterator() {

    }

}