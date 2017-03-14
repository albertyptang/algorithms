package io.github.albertyptang.util.collection;

/**
 * @author atang
 */
public interface Queue<E> {

    void enqueue(final E item);

    E dequeue();

    E peek();

    boolean isEmpty();
}
