package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.List;

/**
 * Given an array of integers, find the length of longest subsequence which is first increasing then decreasing.
 * <p>
 * *Example: **
 * <p>
 * For the given array [1 11 2 10 4 5 2 1]
 * <p>
 * Longest subsequence is [1 2 10 4 2 1]
 * <p>
 * Return value 6
 *
 * @author atang
 */
public class LengthOfLongestSubsequence {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int longestSubsequenceLength(final List<Integer> A) {
        if (A.size() < 1) {
            return 0;
        }

        int max = 0;
        final int n = A.size();
        final int[] inc = new int[n];
        final int[] dec = new int[n];

        inc[0] = 1;
        for (int i = 1; i < n; i++) {
            inc[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (A.get(i) > A.get(j) && inc[i] < inc[j] + 1) {
                    // find the largest preceding increasing subsequence.
                    inc[i] = inc[j] + 1;
                }
            }
        }

        dec[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (A.get(i) > A.get(j) && dec[i] < dec[j] + 1)
                    // find largest successive decreasing subsequence
                    dec[i] = dec[j] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - 1);
        }
        return max;
    }
}
