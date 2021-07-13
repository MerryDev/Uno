package de.digitaldevs.uno.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * This class represents a generic wrapper for elements wich should be linked with another wrapped element.
 *
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.1
 */
public class ElementWrapper<E> {

    @Getter private E data;
    @Getter @Setter private ElementWrapper<E> next;

    public ElementWrapper<E> setData(E data) {
        this.data = data;
        return this;
    }

}
