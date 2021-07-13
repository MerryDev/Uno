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

    private E data;
    private ElementWrapper<E> next;

    public E getData() {
        return data;
    }

    public ElementWrapper<E> getNext() {
        return next;
    }

    public ElementWrapper<E> setNext(ElementWrapper<E> next) {
        this.next = next;
        return this;
    }

    public ElementWrapper<E> setData(E data) {
        this.data = data;
        return this;
    }

}
