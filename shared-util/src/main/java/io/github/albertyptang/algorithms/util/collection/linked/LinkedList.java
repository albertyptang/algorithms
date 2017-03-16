package io.github.albertyptang.algorithms.util.collection.linked;

import io.github.albertyptang.algorithms.util.collection.IList;

/**
 * @author atang
 */
public class LinkedList<E> extends Linked<E> implements IList<E> {

    public void addToHead(final E item) {
        super.addToHead(item);
    }

    public void addToTail(final E item) {
        super.addToTail(item);
    }

    public E deleteHead() {
        return super.deleteHead();
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
