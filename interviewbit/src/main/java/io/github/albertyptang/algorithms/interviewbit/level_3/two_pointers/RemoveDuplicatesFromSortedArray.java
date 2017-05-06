package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import java.util.ArrayList;

/**
 * Remove duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.
 * <p>
 * Note that even though we want you to return the new length, make sure to change the original array as well in place
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * Example:
 * Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 *
 * @author atang
 */
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(ArrayList<Integer> a) {
        int i = a.size() - 1;
        while (i > 0) {
            if (a.get(i).equals(a.get(i - 1))) {
                a.remove(i);
            }
            i--;
        }
        return a.size();
    }
}
