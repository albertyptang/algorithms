package io.github.albertyptang.algorithms.interviewbit.binary_search;

import java.util.List;

/**
 * Given a sorted array of integers, find the number of occurrences of a given target value.
 * Your algorithm’s runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return 0
 *
 * **Example : **
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return 2.
 *
 * @author atang
 */
public class CountElementOccurrence {
    // DO NOT MODIFY THE LIST
    public static int findCount(final List<Integer> a, final int b) {
        if (a.size() == 0) {
            return 0;
        }
        int count = 0;
        final int medianIndex = a.size() / 2;
        if (a.get(medianIndex) == b) {
            count++;
        }
        count += findCount(a.subList(0/*inclusive*/, medianIndex/*exclusive*/), b);
        count += findCount(a.subList(medianIndex + 1, a.size()), b);
        return count;
    }
}
