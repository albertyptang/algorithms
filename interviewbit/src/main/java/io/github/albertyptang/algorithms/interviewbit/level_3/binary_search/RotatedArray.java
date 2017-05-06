package io.github.albertyptang.algorithms.interviewbit.level_3.binary_search;

import java.util.List;

/**
 * Suppose a sorted array A is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * Find the minimum element.
 * <p>
 * The array will not contain duplicates.
 * <p>
 * NOTE 1: Also think about the case when there are duplicates. Does your current solution work? How does the time complexity change?*
 * <p>
 * Note: If you know the number of times the array is rotated, then this problem becomes trivial. If the number of rotation is x, then minimum element is A[x].
 * Lets look at how we can calculate the number of times the array is rotated.
 *
 * @author atang
 */
public class RotatedArray {
    // DO NOT MODIFY THE LIST
    public static int findMin(final List<Integer> a) {
        if (a.get(0) <= a.get(a.size() - 1)) { // if not rotated.
            return a.get(0);
        }
        return a.get(findMinIndex(a, 0, a.size() - 1, a.get(0)));
    }

    public static int findMinIndex(final List<Integer> a, final int startIndex, final int endIndex, final int first) {
        if (a.size() == 1) {
            return a.get(0);
        }
        final int medianIndex = (startIndex + endIndex) / 2;
        final int median = a.get(medianIndex);
        if (medianIndex > 0 && a.get(medianIndex - 1) > median) {
            return medianIndex;
        } else if (median > first) {
            return findMinIndex(a, medianIndex + 1, endIndex, first);
        } else {
            return findMinIndex(a, startIndex, medianIndex - 1, first);
        }
    }
}
