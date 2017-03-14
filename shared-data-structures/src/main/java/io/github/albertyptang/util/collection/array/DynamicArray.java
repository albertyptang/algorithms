package io.github.albertyptang.util.collection.array;

/**
 * @author atang
 */
public class DynamicArray<E> {

    private static final int INITIAL_CAPACITY = 1 << 4; // 16

    private static final int MAXIMUM_CAPACITY = 1 << 30; // 1 billion

    private E[] array = createTable(INITIAL_CAPACITY);

    private int size;

    /**
     * average  O(1)
     * worst    O(1)
     */
    public E get(final int index) {
        validateIndex(index);
        return array[index];
    }

    /**
     * average  O(1)
     * worst    O(1)
     */
    public void set(final int index, final E item) {
        validateIndex(index);
        array[index] = item;
    }

    /**
     * average  O(1)
     * worst    O(1)
     */
    public void add(final E item) throws Exception {
        if (size == MAXIMUM_CAPACITY) {
            throw new Exception("Array length is too large");
        }
        size++;
        if (size > array.length) {
            grow(size);
        }
        array[size - 1] = item;
    }

    public int length() {
        return array.length;
    }

    /**
     * increase size of underlying array.
     */
    /*package*/ void grow(final int necessaryCapacity) {
        if (necessaryCapacity > array.length) {
            // double capacity.
            int newCapacity = array.length << 1;
            // the following will account for overflowed integers.
            if (newCapacity < INITIAL_CAPACITY || newCapacity < necessaryCapacity) {
                newCapacity = necessaryCapacity;
            }
            final E[] newArray = createTable(newCapacity);
            // refill array.
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    @SuppressWarnings("unchecked") // suppress generic array cast.
    private E[] createTable(final int capacity) {
        return (E[]) new Object[capacity];
    }

    private void validateIndex(final int index) {
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("index: " + index + ", capacity: " + array.length);
        }
    }
}
