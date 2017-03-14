package io.github.albertyptang.util.collection.linked;

import io.github.albertyptang.util.collection.List;

/**
 * @author atang
 */
public class ListImpl<E> extends LinkedList<E> implements List<E> {

    public void append(final E item) {
        super.append(item);
    }

    public void prepend(final E item) {
        super.prepend(item);
    }

    public E deleteHead() {
        return super.deleteTail();
    }

    public E deleteTail() {
        return super.deleteTail();
    }

    public E search(final E item) {
        return super.search(item);
    }

    public E getTail() {
        return super.getTail();
    }

    public int getSize() {
        return size;
    }

    public E getHead() {
        return super.getHead();
    }
}
