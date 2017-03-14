package io.github.albertyptang.util.collection;

/**
 * @author atang
 */
public interface List<E> {

    void append(final E item);

    void prepend(final E item);

    E deleteHead();

    E deleteTail();

    E search(final E item);

    E getTail();

    E getHead();

    int getSize();

    boolean isEmpty();
}
