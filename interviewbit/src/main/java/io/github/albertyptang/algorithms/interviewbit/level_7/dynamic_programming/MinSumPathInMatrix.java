package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * Example :
 * <p>
 * Input :
 * <p>
 * 1 3 2
 * 4 3 1
 * 5 6 1
 * <p>
 * Output : 8
 * 1 -> 3 -> 2 -> 1 -> 1
 *
 * @author atang
 */
public class MinSumPathInMatrix {

    private static class Coordinate {
        public int x;
        public int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Coordinate that = (Coordinate) o;

            if (x != that.x) return false;
            return y == that.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
    public static int minPathSum(ArrayList<ArrayList<Integer>> a) {
        final int n = a.size();
        if (a.size() < 1) {
            return 0;
        }
        final int m = a.get(0).size();
        final Map<Coordinate,Integer> coordinateToMinSum = new HashMap<>();
        coordinateToMinSum.put(new Coordinate(0,0), a.get(0).get(0));
        return minPathSum(coordinateToMinSum, a, new Coordinate(m - 1, n - 1), m, n);
    }

    private static int minPathSum(final Map<Coordinate,Integer> coordinateToMinSum,
                                  final ArrayList<ArrayList<Integer>> a,
                                  final Coordinate coordinate,
                                  final int m,
                                  final int n) {
        if (coordinateToMinSum.containsKey(coordinate)) {
            return coordinateToMinSum.get(coordinate);
        }
        if (coordinate.x < 0 || coordinate.x > m - 1 || coordinate.y < 0 || coordinate.y > n - 1) {
            return Integer.MAX_VALUE;
        }
        final int val = a.get(coordinate.y).get(coordinate.x);
        final int minFromLeft =  minPathSum(coordinateToMinSum, a, new Coordinate(coordinate.x - 1, coordinate.y), m, n);
        final int minFromTop = minPathSum(coordinateToMinSum, a, new Coordinate(coordinate.x, coordinate.y - 1), m, n);
        final int minSum =  val + Math.min(minFromLeft, minFromTop);
        coordinateToMinSum.put(coordinate, minSum);
        return minSum;
    }
}
