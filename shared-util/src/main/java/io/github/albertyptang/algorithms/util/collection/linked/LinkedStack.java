package io.github.albertyptang.algorithms.util.collection.linked;

import io.github.albertyptang.algorithms.util.collection.IStack;

/**
 * @author atang
 */
public class LinkedStack<E> extends Linked<E> implements IStack<E> {

    public void push(final E item) {
        addToHead(item);
    }

    public E pop() {
        return deleteHead();
    }

    public E peek() {
        return getHead();
    }
}
