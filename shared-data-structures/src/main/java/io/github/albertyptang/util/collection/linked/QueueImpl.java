package io.github.albertyptang.util.collection.linked;

import io.github.albertyptang.util.collection.Queue;

/**
 * @author atang
 */
public class QueueImpl<E> extends LinkedList<E> implements Queue<E> {

    public void enqueue(final E item) {
        append(item);
    }

    public E dequeue() {
        return deleteHead();
    }

    public E peek() {
        return getHead();
    }
}
