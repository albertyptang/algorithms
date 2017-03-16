package io.github.albertyptang.algorithms.util;

/**
 * @author atang
 */
public class ArrayUtils {

    /**
     * clone boxed integer array to a primitive int array.
     * @param integerArray
     * @return primitive array.
     */
    public static int[] toIntArray(final Integer[] integerArray) {
        final int[] intArray =  new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i];
        }
        return intArray;
    }
}
