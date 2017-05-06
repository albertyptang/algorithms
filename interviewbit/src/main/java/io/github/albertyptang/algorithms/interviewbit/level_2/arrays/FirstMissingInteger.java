package io.github.albertyptang.algorithms.interviewbit.level_2.arrays;

import java.util.ArrayList;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * <p>
 * Example:
 * <p>
 * Given [1,2,0] return 3,
 * <p>
 * [3,4,-1,1] return 2,
 * <p>
 * [-8,-7,-6] returns 1
 * <p>
 * Your algorithm should run in O(n) time and use constant space.
 *
 * @author atang
 */
public class FirstMissingInteger {
    public static int firstMissingPositive(final ArrayList<Integer> a) {
        // use array as set?
        // change array so that each index is the value - 1, and negative marks as whether that value exists in a.
        // eg.  1,3,5,7,2 becomes -1,-3,-5,7,-2
        //      thus, 4 is the value that does not exist in a

        // first change all numbers less than 1 to allow sign to be a found marker.
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < 1) {
                a.set(i, a.size() + 1); // set to it a number that cannot be found.
            }
        }
        // next mark found values as negatives at index value - 1
        for (int i = 0; i < a.size(); i++) {
            final int foundValue = Math.abs(a.get(i)); // ignore marker
            if (foundValue - 1 >= 0 && foundValue - 1 < a.size()) {
                final int valueAtFoundIndex = a.get(foundValue - 1);
                if (valueAtFoundIndex > 0) { // don't do anything if it is already marked as negative.
                    a.set(foundValue - 1, -1 * valueAtFoundIndex);
                }
            }
        }
        // find the first non-marked index.
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0) {
                return i + 1;
            }
        }
        // all found or empty array
        return a.size() + 1;
    }
}
