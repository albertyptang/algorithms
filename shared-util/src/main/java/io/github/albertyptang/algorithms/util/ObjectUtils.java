package io.github.albertyptang.algorithms.util;

/**
 * @author atang
 */
public class ObjectUtils {

    /**
     * equality utility to handle nullable objects.
     * @param object1
     * @param object2
     * @return whether they equal.
     */
    public static boolean equals(final Object object1, final Object object2) {
        if (object1 == null) {
            return object2 == null;
        } else {
            return object1.equals(object2);
        }
    }
}
