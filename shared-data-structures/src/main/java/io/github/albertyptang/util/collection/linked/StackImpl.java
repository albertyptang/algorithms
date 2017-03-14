package io.github.albertyptang.util.collection.linked;

import io.github.albertyptang.util.collection.Stack;

/**
 * @author atang
 */
public class StackImpl<E> extends LinkedList<E> implements Stack<E> {

    public void push(final E item) {
        prepend(item);
    }

    public E pop() {
        return deleteHead();
    }

    public E peek() {
        return getHead();
    }
}
