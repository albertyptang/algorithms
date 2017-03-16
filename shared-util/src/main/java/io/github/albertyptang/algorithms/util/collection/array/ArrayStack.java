package io.github.albertyptang.algorithms.util.collection.array;

import io.github.albertyptang.algorithms.util.collection.IStack;

/**
 * @author atang
 */
public class ArrayStack<E> extends DynamicArray<E> implements IStack<E> {

    public void push(final E item) {
        add(item);
    }

    public E pop() {
        return remove();
    }

    public E peek() {
        return get(size - 1);
    }
}
