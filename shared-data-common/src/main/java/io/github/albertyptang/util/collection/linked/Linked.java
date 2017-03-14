package io.github.albertyptang.util.collection.linked;

import io.github.albertyptang.util.ObjectUtils;

/**
 * underlying linked data structure to be used only by other linked implementations.
 * @author atang
 */
/*package*/ class Linked<E> {

    /*package*/ Linked.Node<E> head;
    /*package*/ Linked.Node<E> tail;
    public int size;

    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(final E item) {
            this.data = item;
        }
    }

    /**
     * add element to the beginning.
     *
     * average  O(1)
     * worst    O(1)
     */
    /*package*/ void addToHead(final E item) {
        size++;
        final Linked.Node<E> newHead = new Linked.Node<E>(item);
        newHead.next = head; // add element to head.
        head = newHead; // reassign head to new head.
        if (tail == null) { // handle originally empty list.
            tail = head;
        }
    }

    /**
     * add element to the end.
     *
     * average  O(1)
     * worst    O(1)
     */
    /*package*/ void addToTail(final E item) {
        size++;
        if (tail == null) { // handle originally empty list.
            tail = new Linked.Node<E>(item);
            head = tail;
        } else {
            tail.next = new Linked.Node<E>(item); // add element to tail.
            tail = tail.next; // reassign tail to new tail.
        }
    }

    /**
     * delete first element.
     *
     * average  O(1)
     * worst    O(1)
     */
    /*package*/ E deleteHead() {
        if (size > 0) {
            size--;
            final Linked.Node<E> oldHead = head;
            final E oldHeadData = oldHead.data;
            if (head.next != null) {
                // update head.
                head = head.next;
                // remove old head from list.
                oldHead.next = null;
            }
            handleEmptyList();
            return oldHeadData;
        }
        return null;
    }

    /**
     * delete last element.
     *
     * average  O(n)
     * worst    O(n)
     */
    /*package*/ E deleteTail() {
        if (size > 0) {
            final E oldTailData = tail.data;
            size--;
            Linked.Node<E> searchLinkedList = head;
            // find the element right before the tail.
            while (searchLinkedList.next != tail) {
                searchLinkedList = searchLinkedList.next;
            }
            // update tail.
            tail = searchLinkedList;
            // remove old tail from list.
            tail.next = null;
            handleEmptyList();
            return oldTailData;
        }
        return null;
    }

    /**
     * @return item found in data structure.  return null if nothing was found or if the item was null.
     *
     * average  O(n)
     * worst    O(n)
     */
    /*package*/ E searchFor(final E item) {
        Linked.Node<E> searchLinkedList = head;
        while (searchLinkedList != null) {
            if (ObjectUtils.equals(searchLinkedList.data, item)) {
                return searchLinkedList.data;
            }
            searchLinkedList = searchLinkedList.next;
        }
        return null;
    }

    /**
     * @return last item.
     */
    /*package*/ E getTail() {
        if (tail != null) {
            return tail.data;
        } else {
            return null;
        }
    }

    /**
     * @return first item.
     */
    /*package*/ E getHead() {
        if (head != null) {
            return head.data;
        } else {
            return null;
        }
    }

    /**
     * @return whether the data structure is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    private void handleEmptyList() {
        if (size == 0) {
            head = null;
            tail = null;
        }
    }
}
