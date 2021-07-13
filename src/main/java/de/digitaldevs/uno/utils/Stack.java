package de.digitaldevs.uno.utils;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a generic stack data structure based on the composite design pattern.
 *
 * @author Sven
 * @author <a href='https://digitaldevs.de'>DigitalDevs.de</a>
 * @version 1.0.0
 */
public class Stack<E> {

    /**
     * The list holding all elements. Uses {@code @Getter} annotation from lombok framework to create a getter method during compiling.
     */
    @Getter
    private final List<ElementWrapper<E>> content;

    /**
     * The first element of the stack.
     */
    private ElementWrapper<E> first;

    /**
     * Instantiates a new empty stack and sets the first element to a {@code EndElement}.
     */
    public Stack() {
        this.content = new ArrayList<>();
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
        this.content.add(0, wrapper);
    }

    /**
     * Removes the first element and updates the first element to firsts' linked next element.
     *
     * @return The removed wrapped element
     */
    public ElementWrapper<E> pop() {
        ElementWrapper<E> currentFirst = this.first;
        this.first = currentFirst.getNext();
        this.content.remove(0);

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
     * @throws UnsupportedOperationException if this method is called
     */
    public void shuffle() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This functionality is not supported yet!");
    }

    /**
     * Clears the stack.
     */
    public void clear() {
        this.first = new EndElement<>();
        this.content.clear();
    }

    /**
     * Gets the postion of a wrapped element in a stack.
     *
     * @param target The wrapped element witch should be found
     * @return The position of the wrapped element in the stack or {@code -1} if the element was not found
     */
    public int find(ElementWrapper<E> target) {
        for (int i = 0; i < this.content.size(); i++) if (content.get(i).getData().equals(target.getData())) return i;
        return -1;
    }

    /**
     * Checks if the stack is currently empty.
     *
     * @return {@code true}
     */
    public boolean isEmpty() {
        return this.content.isEmpty();
    }


}
