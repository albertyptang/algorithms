package io.github.albertyptang.algorithms.interviewbit.binary_search;

import java.util.List;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1 2 ).
 *
 * You are given a target value to search. If found in the array, return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * Input : [4 5 6 7 0 1 2] and target = 4
 * Output : 0
 *
 * @author atang
 */
public class RotatedSortedArraySearch {

    // DO NOT MODIFY THE LIST
    public static int search(final List<Integer> a, int b) {
        if (a.get(0) <= a.get(a.size() - 1)) { // if not rotated.
            return binarySearch(a, 0, a.size(), b);
        }
        final int minIndex = RotatedArray.findMinIndex(a, 0, a.size() - 1, a.get(0));
        final int minValue = a.get(minIndex);
        if (b == minValue) {
            return minIndex;
        } else if (b < a.get(0)) {
            // if b is less than the value at index 0, search the right.
            final List<Integer> rightArray = a.subList(minIndex + 1, a.size()/*exclusive*/);
            final int rightIndex = binarySearch(rightArray, 0, rightArray.size() - 1, b);
            return rightIndex < 0 ? -1 : minIndex + 1 + rightIndex;
        } else {
            // if b is more than the value at index 0, search the left.
            final List<Integer> leftArray = a.subList(0, minIndex/*exclusive*/);
            return binarySearch(leftArray, 0, leftArray.size() - 1, b);
        }
    }

    private static int binarySearch(final List<Integer> a, final int min, final int max, int b) {
        if (min > max) {
            return -1;
        }
        final int medianIndex = (min + max) / 2;
        final int medianValue = a.get(medianIndex);
        if (medianValue == b) {
            return medianIndex;
        } else if (b < medianValue) {
            return binarySearch(a, min, medianIndex - 1, b);
        } else {
            return binarySearch(a, medianIndex + 1, max, b);
        }
    }
}
