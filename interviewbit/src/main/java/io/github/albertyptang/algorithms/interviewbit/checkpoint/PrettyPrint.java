package io.github.albertyptang.algorithms.interviewbit.checkpoint;

import java.util.ArrayList;

/**
 * Print concentric rectangular pattern in a 2d matrix.
 * Let us show you some examples to clarify what we mean.
 *
 * Example 1:
 *
 * Input: A = 4.
 * Output:
 *
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 *
 * Example 2:
 *
 * Input: A = 3.
 * Output:
 *
 * 3 3 3 3 3
 * 3 2 2 2 3
 * 3 2 1 2 3
 * 3 2 2 2 3
 * 3 3 3 3 3
 *
 * The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.
 *
 * You will be given A as an argument to the function you need to implement, and you need to return a 2D array.
 *
 * @author atang
 */
public class PrettyPrint {

    public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        final int length = 2 * a - 1;
        final ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            final ArrayList<Integer> row = new ArrayList<>(length);
            int minValue = Math.max(a - i, i - a + 2 /* account for a - i < 1 */);
            for (int j = 0; j < length; j++) {
                int value = Math.max(a - j, j - a + 2 /* account for a - j < 1 */);
                // eg. 4 3 2 1 2 3 4
                // use minValue to place a minimum cap on values based off of row number.
                // eg. 4 3 3 3 3 3 4 for row index 1
                // eg. 4 3 2 2 2 3 4 for row index 2
                row.add(Math.max(minValue, value));
            }
            matrix.add(row);
        }
        return matrix;
    }
}