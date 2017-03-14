package io.github.albertyptang.util.collection.linked;

import io.github.albertyptang.util.collection.Stack;

/**
 * @author atang
 */
public class LinkedStack<E> extends Linked<E> implements Stack<E> {

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
