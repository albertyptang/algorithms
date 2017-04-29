package io.github.albertyptang.algorithms.interviewbit.checkpoint;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array of non negative integers A, and a range (B, C),
 * find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C
 *
 * Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
 * where 0 <= i <= j < size(A)
 *
 * Example :
 *
 * A : [10, 5, 1, 0, 2]
 * (B, C) : (6, 8)
 * ans = 3
 * as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]
 *
 * NOTE : The answer is guaranteed to fit in a 32 bit signed integer.
 * @author atang
 */
public class NumRange {
    public static int numRange(ArrayList<Integer> a, int b, int c) {
        int count = 0;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < a.size(); end++) {
            sum += a.get(end);
            while (sum > c) {
                sum -= a.get(start);
                start++;
            }
            // find all possibilities with the current end.
            int innerSum = sum;
            int innerStart = start;
            while (innerSum >= b && innerStart <= end) {
                count++;
                innerSum -= a.get(innerStart);
                innerStart++;
            }
        }
        return count;
    }
}
