package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import java.util.ArrayList;

/**
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai).
 * 'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * <p>
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Your program should return an integer which corresponds to the maximum area of water that can be contained
 * ( Yes, we know maximum area instead of maximum volume sounds weird. But this is 2D plane we are working with for simplicity ).
 * <p>
 * Note: You may not slant the container.
 * Example :
 * <p>
 * Input : [1, 5, 4, 3]
 * Output : 6
 * <p>
 * Explanation : 5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3.
 * So total area = 3 * 2 = 6
 *
 * @author atang
 */
public class ContainerWithTheMostWater {

    public static int maxArea(ArrayList<Integer> a) {
        int min = 0;
        int max = a.size() - 1;

        int maxArea = 0;
        while (min < max) {
            int area = Math.min(a.get(min), a.get(max)) * (max - min);
            maxArea = Math.max(area, maxArea);
            if (a.get(min) < a.get(max)) {
                min++;
            } else {
                max--;
            }
        }
        return maxArea;
    }
}