package de.digitaldevs.uno.game.cards;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public record SpecialCard(@NotNull @Getter SpecialCardType type, @Getter Color color) implements Card {
}
