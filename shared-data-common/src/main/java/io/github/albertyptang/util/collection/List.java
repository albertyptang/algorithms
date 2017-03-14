package io.github.albertyptang.util.collection;

/**
 * @author atang
 */
public interface List<E> {

    /**
     * add item to the beginning of the list.
     * @param item item to add.
     */
    void addToHead(final E item);

    /**
     * add item to the end of the list.
     * @param item item to add.
     */
    void addToTail(final E item);

    /**
     * remove the first item in the list.
     * @return the removed item.
     */
    E deleteHead();

    /**
     * remove the last item in the list.
     * @return the removed item.
     */
    E deleteTail();

    /**
     * @param item item to search for.
     * @return item found in list.  return null if nothing was found or if the item was null.
     */
    E searchFor(final E item);

    /**
     * @return first item.
     */
    E getHead();

    /**
     * @return last item.
     */
    E getTail();

    /**
     * @return the size of the list.
     */
    int length();

    /**
     * @return whether the list is empty.
     */
    boolean isEmpty();
}
