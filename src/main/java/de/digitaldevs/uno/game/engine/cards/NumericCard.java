package de.digitaldevs.uno.game.engine.cards;

import lombok.Getter;

import java.awt.*;

public record NumericCard(@Getter int number, @Getter Color color) implements Card {
}
