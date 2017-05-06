package io.github.albertyptang.algorithms.interviewbit.level_2.arrays;

import java.util.ArrayList;

/**
 * Find out the maximum sub-array of non negative numbers from an array.
 * The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
 * <p>
 * Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).
 * <p>
 * Example:
 * <p>
 * A : [1, 2, 5, -7, 2, 3]
 * The two sub-arrays are [1, 2, 5] [2, 3].
 * The answer is [1, 2, 5] as its sum is larger than [2, 3]
 * NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
 * NOTE 2: If there is still a tie, then return the segment with minimum starting index
 *
 * @author atang
 */
public class MaxNonNegativeSubArray {

    public static ArrayList<Integer> maxset(final ArrayList<Integer> a) {
        long maxSum = 0;
        int start = 0; // inclusive
        int end = 0; // exclusive

        long currentSum = 0;
        int currentStart = 0;
        for (int i = 0; i <= a.size(); i++) {
            if (i == a.size() || a.get(i) < 0) {
                if (currentSum > maxSum ||
                    (currentSum == maxSum && end - start < i - currentStart) ||
                    (currentSum == maxSum && end - start == i - currentStart && currentStart < start)) {
                    maxSum = currentSum;
                    start = currentStart;
                    end = i;
                }
                // reset
                currentStart = i + 1;
                currentSum = 0;
            } else {
                currentSum += a.get(i);
            }
        }
        return new ArrayList<>(a.subList(start, end));
    }

}
