package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.ArrayList;

/**
 * Given a grid of size m * n, lets assume you are starting at (1,1) and your goal is to reach (m,n).
 * At any instance, if you are on (x,y), you can either go to (x, y + 1) or (x + 1, y).
 * <p>
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * <p>
 * Example :
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * <p>
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * The total number of unique paths is 2.
 * <p>
 * Note: m and n will be at most 100.
 *
 * @author atang
 */
public class UniquePathsInAGrid {
    // NOTE : apparently in this world y + 1 means moving downwards.
    public static int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> a) {
        final int n = a.size();
        if (a.size() < 1) {
            return 0;
        }
        final int m = a.get(0).size();
        if (a.get(0).get(0) == 1) { // no possible solutions if (1,1) is blocked
            return 0;
        }
        final Integer[][] uniquePathSolutions = new Integer[m + 1][n + 1];
        uniquePathSolutions[1][1] = 1;
        return getUniquePaths(a, uniquePathSolutions, m, n, m,n);
    }

    private static int getUniquePaths(final ArrayList<ArrayList<Integer>> a,
                                      final Integer[][] uniquePathSolutions,
                                      final int m, final int n,
                                      final int x, final int y) {
        if (x > m || x < 1 || y > n || y < 1) {
            return 0; // no path.
        }
        if (uniquePathSolutions[x][y] != null) {
            return uniquePathSolutions[x][y];
        }
        final int xIndex = x - 1;
        final int yIndex = y - 1;
        if (a.get(yIndex).get(xIndex) == 1) {
            uniquePathSolutions[x][y] = 0;
            return 0; // blocked.
        }
        final int pathsFromLeft = getUniquePaths(a, uniquePathSolutions, m, n, x - 1, y);
        final int pathsFromBottom = getUniquePaths(a, uniquePathSolutions, m, n, x, y - 1);
        final int paths = pathsFromLeft + pathsFromBottom;
        uniquePathSolutions[x][y] = paths;
        return paths;
    }
}

