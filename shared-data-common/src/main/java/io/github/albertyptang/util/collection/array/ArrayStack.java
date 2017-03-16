package io.github.albertyptang.util.collection.array;

import io.github.albertyptang.util.collection.Stack;

/**
 * @author atang
 */
public class ArrayStack<E> extends DynamicArray<E> implements Stack<E> {

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
