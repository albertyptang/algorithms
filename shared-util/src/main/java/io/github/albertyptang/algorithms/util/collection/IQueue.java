package io.github.albertyptang.algorithms.util.collection;

/**
 * @author atang
 */
public interface IQueue<E> {

    /**
     * add item to the end of the queue.
     * @param item item to add.
     */
    void enqueue(final E item);

    /**
     * remove the last item in the queue.
     * @return the removed item.
     */
    E dequeue();

    /**
     * @return the first item in the queue.
     */
    E peek();

    /**
     * @return whether the queue is empty.
     */
    boolean isEmpty();
}
