package de.digitaldevs.uno.game.engine;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;

/**
 * @author MerryChrismas
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
@RequiredArgsConstructor
public class Card {

    @Getter private final int number;
    @Getter private final Color color;

}
