package de.digitaldevs.uno.utils;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

/**
 * This class represents a generic stack data structure based on the composite design pattern.
 *
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class Stack<E> implements Iterable<E> {

    private static final double SHUFFLE_PROBABILITY = 0.7;

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
    public void shuffle() {
        System.out.println(this.first.getData());
        for (int i = 0; i < 500; i++) {
            Iterator<E> iterator = this.iterator();
            while (iterator.hasNext()) {
                boolean shouldShuffle = new Random().nextInt() * SHUFFLE_PROBABILITY >= SHUFFLE_PROBABILITY;

                if (shouldShuffle) {
                    System.out.println(i);
                }
            }
        }
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
    public @NotNull Iterator<E> iterator() {
        return new Iterator<>() {

            ElementWrapper<E> wrapper = Stack.this.first;

            @Override
            public boolean hasNext() {
                return !(wrapper instanceof EndElement);
            }

            @Override
            public E next() {
                E data = new EndElement<E>().getData();
                if (!(wrapper instanceof EndElement)) {
                    data = wrapper.getData();
                    wrapper = wrapper.getNext();
                }
                return data;
            }
        };
    }

}
