package io.github.albertyptang.algorithms.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a set of digits (A) in sorted order, find how many numbers of length B are possible whose value is less than number C.
 *
 * NOTE: All numbers can only have digits from the given set.
 * Examples:
 *
 * Input:
 * 3 0 1 5
 * 1
 * 2
 * Output:
 * 2 (0 and 1 are possible)
 *
 * Input:
 * 4 0 1 2 5
 * 2
 * 21
 * Output:
 * 5 (10, 11, 12, 15, 20 are possible)
 * Constraints:
 *
 * 1 <= B <= 9, 0 <= C <= 1e9 & 0 <= A[i] <= 9
 *
 * @author atang
 */
public class LengthNLessThanK {

    public static int solve(ArrayList<Integer> A, int B, int C) {
        int length = B;
        int count = 0;
        int cDigitsRemoved = C;

        // look at each digit of C starting from the greatest
        while (length > 0) {
            final int digit = (int) (cDigitsRemoved / Math.pow(10,length - 1));
            // if C has fewer digits than B:
            if (length == B && B > 1 && digit == 0) {
                return 0;
            }
            cDigitsRemoved -= digit * Math.pow(10,length - 1);
            for (final int a : A) {
                // don't include 0 as the greatest digit unless B is 1.
                if (a < digit && (a > 0 || length != B || B == 1)) {
                    count+= Math.pow(A.size(),length - 1); // add every permutation of any remaining digits.
                }
            }
            length = A.contains(digit) ? length - 1 : 0; // continue loop if the digit exists in A.
        }
        return count;
    }
}
