package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.ArrayList;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 * <p>
 * For example, given the following triangle
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * <p>
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 *
 * @author atang
 */
public class MinSumPathInATriangle {
    public static int minimumTotal(ArrayList<ArrayList<Integer>> a) {
        final int height = a.size();
        if (height < 1) {
            return 0;
        }
        final ArrayList<Integer> lastRow = a.get(height - 1);
        final Integer[][] minSumRecord = new Integer[height][lastRow.size()];
        int globalMinSum = Integer.MAX_VALUE;
        minSumRecord[0][0] = a.get(0).get(0);
        for (int i = 0; i < lastRow.size(); i++) {
            final int minSum = minSum(minSumRecord, a, i, height - 1);
            globalMinSum = Math.min(minSum, globalMinSum);
        }
        return globalMinSum;
    }

    private static int minSum(final Integer[][] minSumRecord, final ArrayList<ArrayList<Integer>> a, final int x, final int y) {
        if (y < 0 || y >= a.size() || x < 0 || x >= a.get(y).size()) {
            return Integer.MAX_VALUE;
        } else if (minSumRecord[y][x] != null) {
            return minSumRecord[y][x];
        }
        int val = a.get(y).get(x);
        int minSumFromTopLeft = minSum(minSumRecord, a, x - 1, y - 1);
        int minSumFromTopRight = minSum(minSumRecord, a, x, y - 1);
        int minSum = val + Math.min(minSumFromTopLeft, minSumFromTopRight);
        minSumRecord[y][x] = minSum;
        return minSum;
    }
}
