package io.github.albertyptang.algorithms.util.collection.linked;

import io.github.albertyptang.algorithms.util.collection.IQueue;

/**
 * @author atang
 */
public class LinkedQueue<E> extends Linked<E> implements IQueue<E> {

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
