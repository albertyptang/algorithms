package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find the longest increasing subsequence of a given sequence / array.
 * <p>
 * In other words, find a subsequence of array in which the subsequence’s elements are in strictly increasing order,
 * and in which the subsequence is as long as possible.
 * This subsequence is not necessarily contiguous, or unique.
 * In this case, we only care about the length of the longest increasing subsequence.
 * <p>
 * Example :
 * <p>
 * Input : [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15]
 * Output : 6
 * The sequence : [0, 2, 6, 9, 13, 15] or [0, 4, 6, 9, 11, 15] or [0, 4, 6, 9, 13, 15]
 *
 * @author atang
 */
public class LongestIncreasingSubsequence {
    public static int lis(final List<Integer> a) {
        int length = 1;
        if (a.size() < 1) {
            return 0;
        }
        final Map<Integer,Integer> startToLength = new HashMap<>();
        startToLength.put(a.size() - 1, 1);
        for (int i = a.size() - 2; i >= 0; i--) {
            final int startVal = a.get(i);
            int maxLength = 1;
            for (int j = i; j < a.size(); j++) {
                final int anotherStartVal = a.get(j);
                if (startVal < anotherStartVal) {
                    maxLength = Math.max(maxLength, startToLength.get(j) + 1);
                }
            }
            startToLength.put(i, maxLength);
            length = Math.max(length, maxLength);
        }
        return length;
    }
}
