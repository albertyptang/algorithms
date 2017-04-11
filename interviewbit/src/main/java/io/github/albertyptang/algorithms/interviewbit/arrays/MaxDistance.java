package io.github.albertyptang.algorithms.interviewbit.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].
 *
 * If there is no solution possible, return -1.
 *
 * @author atang
 */
public class MaxDistance {

    public static int maximumGap(final List<Integer> a) {
        if (a.size() < 1) {
            return -1;
        }
        final Map<Integer,Integer> numToIndexMin = new HashMap<>();
        final Map<Integer,Integer> numToIndexMax = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            final int num = a.get(i);
            if (!numToIndexMin.containsKey(num)) {
                numToIndexMin.put(num, i); // store all min values.
            } else {
                numToIndexMax.put(num, i); // store only max values.
            }
        }
        final List<Integer> sorted = Arrays.asList(new Integer[a.size()]);
        Collections.copy(sorted, a);
        Collections.sort(sorted);
        final int[] index = new int[a.size()];
        for (int i = 0; i < sorted.size(); i++) {
            final int num = sorted.get(i);
            if (i > 0 && num == sorted.get(i - 1)) { // if repeat, record the highest value.
                index[i] = numToIndexMax.get(num);
            } else {
                index[i] = numToIndexMin.get(num);
            }
        }
        int maxDistance = 0;
        int maxIndex = 0; // largest possible index value of a larger num so far.
        for (int i = index.length - 1; i >=0; i--) { // going from largest to smallest num.
            maxIndex = Math.max(maxIndex, index[i]);
            maxDistance = Math.max(maxIndex - index[i], maxDistance);
        }
        return maxDistance;
    }
}
