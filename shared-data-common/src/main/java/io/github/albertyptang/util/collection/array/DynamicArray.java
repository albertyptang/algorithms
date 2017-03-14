package io.github.albertyptang.util.collection.array;

/**
 * @author atang
 */
public class DynamicArray<E> {

    private static final int INITIAL_CAPACITY = 1 << 4; // 16

    private static final int MAXIMUM_CAPACITY = 1 << 10; // 1024

    private E[] array = createTable(INITIAL_CAPACITY);

    /*package*/ int size;

    /**
     * retrieve item at index.
     *
     * average  O(1)
     * worst    O(1)
     */
    public E get(final int index) {
        validateIndex(index);
        return array[index];
    }

    /**
     * set item at index.
     *
     * average  O(1)
     * worst    O(1)
     */
    public void set(final int index, final E item) {
        validateIndex(index);
        array[index] = item;
    }

    /**
     * add item to end of the populated array.
     *
     * average  O(1)
     * worst    O(1)
     */
    public void add(final E item) throws Exception {
        if (size == MAXIMUM_CAPACITY) {
            throw new Exception("DynamicArray length is too large");
        }
        size++;
        if (size > array.length) {
            grow(size);
        }
        array[size - 1] = item;
    }

    /**
     * @return full length (capacity) of the array.
     */
    public int length() {
        return array.length;
    }

    /**
     * increase the capacity of the array.
     * @param necessaryCapacity minimum capacity required.
     */
    /*package*/ void grow(final int necessaryCapacity) {
        if (necessaryCapacity > array.length) {
            // double the capacity.
            int newCapacity = array.length << 1;
            // if the new capacity is too large or too small, set it to exactly the capacity required.
            if (newCapacity > MAXIMUM_CAPACITY || newCapacity < necessaryCapacity) {
                newCapacity = necessaryCapacity;
            }
            final E[] newArray = createTable(newCapacity);
            array = refill(array, newArray);
        }
    }

    /**
     * refill the array.
     * @param oldArray
     * @param newArray
     * @return the new array.
     */
    /*package*/ E[] refill(final E[] oldArray, final E[] newArray) {
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
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
