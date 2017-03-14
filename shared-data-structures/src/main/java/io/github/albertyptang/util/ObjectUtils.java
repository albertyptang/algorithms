package io.github.albertyptang.util;

/**
 * @author atang
 */
public class ObjectUtils {

    /**
     * equality utility to handle nullable objects.
     */
    public static boolean equals(final Object object1, final Object object2) {
        if (object1 == null) {
            return object2 == null;
        } else {
            return object1.equals(object2);
        }
    }
}
