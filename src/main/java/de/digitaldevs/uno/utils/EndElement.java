package de.digitaldevs.uno.utils;

/**
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class EndElement<E> extends ElementWrapper<E> {

    @Override
    public ElementWrapper<E> getNext() {
        return this;
    }
}
