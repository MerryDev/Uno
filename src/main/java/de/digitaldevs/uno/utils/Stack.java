package de.digitaldevs.uno.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class represents a generic stack data structure based on the composite design pattern.
 *
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class Stack<E> {

    /**
     * The first element of the stack.
     */
    private ElementWrapper<E> first;

    /**
     * Instantiates a new empty stack and sets the first element to a {@code EndElement}.
     */
    public Stack() {
        this.first = new EndElement<>();
    }

    /**
     * Puts a new wrapped element holding the data on top of the stack and updates {@code first} to the new element.
     *
     * @param wrapper The new wrapped element
     */
    public void push(ElementWrapper<E> wrapper) {
        if (this.first instanceof EndElement) wrapper.setNext(new EndElement<>());
        else wrapper.setNext(this.first);

        this.first = wrapper;
    }

    /**
     * Removes the first element and updates the first element to firsts' linked next element.
     *
     * @return The removed wrapped element
     */
    public ElementWrapper<E> pop() {
        ElementWrapper<E> currentFirst = this.first;
        this.first = currentFirst.getNext();
        return currentFirst;
    }

    /**
     * Returns the current first wrapped element of the stack.
     *
     * @return The current wrapped element
     */
    public ElementWrapper<E> peek() {
        return this.first;
    }

    /**
     * Shuffles the stack.
     *
     * @throws UnsupportedOperationException If this method is called.
     */
    @Deprecated
    public void shuffleCards() {
        throw new UnsupportedOperationException("This functions is not supported yet!");
    }

    /**
     * Clears the stack.
     */
    public void clear() {
        this.first = new EndElement<>();
    }

    /**
     * Gets the position of a wrapped element in a stack.
     *
     * @param target The wrapped element witch should be found
     * @return The position of the wrapped element in the stack or {@code -1} if the element was not found
     * @throws UnsupportedOperationException If this method is called
     */
    @Deprecated
    public int find(ElementWrapper<E> target) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This function is not supported yet!");
    }

    /**
     * Checks if the stack is currently empty.
     *
     * @return {@code true}
     */
    public boolean isEmpty() {
        return this.first instanceof EndElement;
    }

    /**
     * Creates a new {@code Iterator} to be able to iterate through all elements.
     *
     * @return A new {@code Iterator}
     */
    public Iterator<E> iterator() {
        return new Iterator<>() {

            ElementWrapper<E> wrapper = Stack.this.first;

            @Override
            public boolean hasNext() {
                return !(this.wrapper instanceof EndElement);
            }

            @Override
            public E next() {
                if (this.wrapper instanceof EndElement) throw new NoSuchElementException();

                E data = this.wrapper.getData();
                this.wrapper = this.wrapper.getNext();
                return data;
            }
        };
    }


}
