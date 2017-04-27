package io.github.albertyptang.algorithms.interviewbit.bit_manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Given an array of N integers, find the pair of integers in the array which have minimum XOR value.
 * Report the minimum XOR value.
 *
 * Examples :
 * Input
 * 0 2 5 7
 * Output
 * 2 (0 XOR 2)
 * Input
 * 0 4 7 9
 * Output
 * 3 (4 XOR 7)
 *
 * Constraints:
 * 2 <= N <= 100 000
 * 0 <= A[i] <= 1 000 000 000
 *
 * @author atang
 */
public class MinXorValue {

    // let's study an example:
    // 0 4 7 9
    // =
    // 0000
    // 0100
    // 0111
    // 1001
    public static int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int minXor = Integer.MAX_VALUE;
        for (int i = 0; i < A.size() - 1; i++) {
            final int xor = A.get(i)^A.get(i + 1);
            minXor = Math.min(xor, minXor);
        }
        return minXor;
    }
}