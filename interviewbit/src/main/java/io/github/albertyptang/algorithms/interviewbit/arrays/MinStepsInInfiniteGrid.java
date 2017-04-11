package io.github.albertyptang.algorithms.interviewbit.arrays;

import java.util.ArrayList;

/**
 * You are in an infinite 2D grid where you can move in any of the 8 directions :
 *
 * (x,y) to
 * (x+1, y),
 * (x - 1, y),
 * (x, y+1),
 * (x, y-1),
 * (x-1, y-1),
 * (x+1,y+1),
 * (x-1,y+1),
 * (x+1,y-1)
 *
 * You are given a sequence of points and the order in which you need to cover the points.
 * Give the minimum number of steps in which you can achieve it. You start from the first point.
 *
 * @author atang
 */
public class MinStepsInInfiniteGrid {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int steps = 0;
        if (X.size() < 2 || X.size() != Y.size()) {
            return steps;
        }
        int xLocation = X.get(0);
        int yLocation = Y.get(0);

        for (int i = 1; i < X.size(); i++) {
            int xDestination = X.get(i);
            int yDestination = Y.get(i);

            int xPath = Math.abs(xDestination - xLocation);
            int yPath = Math.abs(yDestination - yLocation);

            steps += xPath;
            if (yPath > xPath) {
                steps += (yPath - xPath);
            }
            xLocation = xDestination;
            yLocation = yDestination;
        }
        return steps;
    }
}
