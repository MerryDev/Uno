package de.digitaldevs.uno.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MerryChrismas
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class ElementWrapper<E> {

    @Getter @Setter private E data;
    @Getter @Setter private ElementWrapper<E> next;

}
