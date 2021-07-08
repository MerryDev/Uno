package de.digitaldevs.uno.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class LinkedQueue<E> {

    private ElementWrapper<E> first = this.last = new EndElement<>();
    private ElementWrapper<E> last;
    private int count = 0;

    public void enqueue(ElementWrapper<E> wrapper) {
        if (this.count == 0) {
            this.first = wrapper;
            this.last = this.first;

        } else {
            this.last.setNext(wrapper);
            this.last = this.last.getNext();
        }

        this.count++;
        this.last.setData(wrapper.getData());
        this.last.setNext(new EndElement<>());
    }

    public Iterator<E> iterator() {
        return new Iterator<>() {

            ElementWrapper<E> wrapper = LinkedQueue.this.first;

            @Override
            public boolean hasNext() {
                return !(this.wrapper instanceof EndElement);
            }

            @Override
            public E next() {
                if(this.wrapper instanceof EndElement) throw new NoSuchElementException();

                E data = this.wrapper.getData();
                this.wrapper = this.wrapper.getNext();
                return data;
            }
        };
    }

}
