package de.digitaldevs.uno.utils;

import de.digitaldevs.uno.game.engine.Player;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class LinkedQueueTest extends TestCase {

    public void test() {

        LinkedQueue<Player> queue = new LinkedQueue<>();

        queue.enqueue(new ElementWrapper<Player>().setData(new Player("Alen", new Stack<>())));
        queue.enqueue(new ElementWrapper<Player>().setData(new Player("Alexis", new Stack<>())));

        Iterator<Player> iterator = queue.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next().name());
    }

}