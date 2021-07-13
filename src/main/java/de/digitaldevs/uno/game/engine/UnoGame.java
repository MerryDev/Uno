package de.digitaldevs.uno.game.engine;

import de.digitaldevs.uno.game.engine.cards.Card;
import de.digitaldevs.uno.utils.LinkedQueue;
import de.digitaldevs.uno.utils.Stack;

/**
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class UnoGame {

    private LinkedQueue<Player> players;
    private Stack<Card> hiddenCards;
    private Stack<Card> openCards;

    private Card startCard;

    public UnoGame() {
        this.hiddenCards = new Stack<>();
        this.openCards = new Stack<>();
        this.startSetup();
    }

    private void startSetup() { }

}
