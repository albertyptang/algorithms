package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Example :
 * <p>
 * Input : 3
 * Return : 3
 * <p>
 * Steps : [1 1 1], [1 2], [2 1]
 *
 * @author atang
 */
public class Stairs {
    public static int climbStairs(int a) {
        final Map<Integer, Integer> stepsToWays = new HashMap<>();
        stepsToWays.put(0, 1);
        stepsToWays.put(1, 1);
        for (int i = 2; i <= a; i++) {
            stepsToWays.put(i, stepsToWays.get(i - 1) + stepsToWays.get(i - 2));
        }
        return stepsToWays.get(a);
    }
}
