package io.github.albertyptang.algorithms.util.collection;

/**
 * @author atang
 */
public interface IStack<E> {

    /**
     * add item to the top of the stack.
     * @param item item to add.
     */
    void push(final E item);

    /**
     * remove the top item of the stack.
     * @return the removed item.
     */
    E pop();

    /**
     * @return the top item of the stack.
     */
    E peek();

    /**
     * @return whether the stack is empty.
     */
    boolean isEmpty();
}
