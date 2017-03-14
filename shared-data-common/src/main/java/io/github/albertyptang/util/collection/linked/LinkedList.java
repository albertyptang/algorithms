package io.github.albertyptang.util.collection.linked;

import io.github.albertyptang.util.collection.List;

/**
 * @author atang
 */
public class LinkedList<E> extends Linked<E> implements List<E> {

    public void addToHead(final E item) {
        super.addToHead(item);
    }

    public void addToTail(final E item) {
        super.addToTail(item);
    }

    public E deleteHead() {
        return super.deleteTail();
    }

    public E deleteTail() {
        return super.deleteTail();
    }

    public E searchFor(final E item) {
        return super.searchFor(item);
    }

    public E getHead() {
        return super.getHead();
    }

    public E getTail() {
        return super.getTail();
    }

    public int length() {
        return size;
    }
}
