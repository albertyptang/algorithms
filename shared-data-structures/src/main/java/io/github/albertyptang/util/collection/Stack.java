package io.github.albertyptang.util.collection;

/**
 * @author atang
 */
public interface Stack<E> {

    void push(final E item);

    E pop();

    E peek();

    boolean isEmpty();
}
