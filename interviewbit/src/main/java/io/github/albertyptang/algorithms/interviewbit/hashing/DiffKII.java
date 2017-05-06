package io.github.albertyptang.algorithms.interviewbit.hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.
 * <p>
 * Example :
 * <p>
 * Input :
 * <p>
 * A : [1 5 3]
 * k : 2
 * Output :
 * <p>
 * 1
 * as 3 - 1 = 2
 * <p>
 * Return 0 / 1 for this problem.
 *
 * @author atang
 */
public class DiffKII {

    public static int diffPossible(final List<Integer> a, int b) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            valueToIndex.put(a.get(i), i);
        }
        for (int i = 0; i < a.size(); i++) {
            final int index = valueToIndex.getOrDefault(b + a.get(i), i);
            if (i != index) {
                return 1;
            }
        }
        return 0;
    }
}
