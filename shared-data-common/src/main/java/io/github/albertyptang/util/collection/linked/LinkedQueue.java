package io.github.albertyptang.util.collection.linked;

import io.github.albertyptang.util.collection.Queue;

/**
 * @author atang
 */
public class LinkedQueue<E> extends Linked<E> implements Queue<E> {

    public void enqueue(final E item) {
        addToTail(item);
    }

    public E dequeue() {
        return deleteHead();
    }

    public E peek() {
        return getHead();
    }
}
