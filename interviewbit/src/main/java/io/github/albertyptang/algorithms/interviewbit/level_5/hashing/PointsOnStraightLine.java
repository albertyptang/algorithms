package io.github.albertyptang.algorithms.interviewbit.level_5.hashing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 * <p>
 * Sample Input :
 * <p>
 * (1, 1)
 * (2, 2)
 * Sample Output :
 * <p>
 * 2
 * You will be given 2 arrays X and Y. Each point is represented by (X[i], Y[i])
 *
 * @author atang
 */
public class PointsOnStraightLine {

    public static int maxPoints(final ArrayList<Integer> a, final ArrayList<Integer> b) {
        int max = 0;
        if (a.size() == 0 || a.size() != b.size()) {
            return max;
        }
        // for each point, form a line with other points.
        for (int i = 0; i < a.size(); i++) {

            // slope to number of other points.
            final Map<Double, Integer> slopes = new HashMap<>();
            // number of other points with the same x.
            int verticals = 0;
            // number of times this point occurs in list.
            int overlaps = 1;

            for (int j = i + 1; j < a.size(); j++) {
                final int x1 = a.get(i);
                final int x2 = a.get(j);
                final int y1 = b.get(i);
                final int y2 = b.get(j);
                if (x1 == x2 && y1 == y2) {
                    overlaps++;
                } else if (x1 == x2) {
                    verticals++;
                } else {
                    final double slope = (double) (y1 - y2) / (x1 - x2) + 0.0 /* converts -0.0 to 0.0 */;
                    slopes.put(slope, slopes.getOrDefault(slope, 0) + 1);
                }
            }
            // count the maximum number of other points on one line + this point.
            final int count = overlaps + Math.max(verticals, slopes.values().stream().max(Comparator.naturalOrder()).orElse(0));
            max = Math.max(max, count);
        }
        return max;
    }
}
