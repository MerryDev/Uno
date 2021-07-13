package de.digitaldevs.uno.game.engine;

import de.digitaldevs.uno.game.engine.cards.Card;
import de.digitaldevs.uno.utils.Stack;
import lombok.Getter;

/**
 * @author MerryChrismas
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public record Player(@Getter String name, @Getter Stack<Card> hand) {

    public void playCard(Card card) { }

}
