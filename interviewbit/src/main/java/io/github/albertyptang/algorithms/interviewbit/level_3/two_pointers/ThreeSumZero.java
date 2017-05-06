package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets. For example, given array S = {-1 0 1 2 -1 -4}, A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 *
 * @author atang
 */
public class ThreeSumZero {
    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {

        Collections.sort(a);
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();

        for (int i = 0; i < a.size() - 2; i++) {
            if (i - 1 >= 0 && a.get(i - 1).equals(a.get(i))) {
                continue;
            }
            int minIndex = i + 1;
            int maxIndex = a.size() - 1;
            while (minIndex < maxIndex) {
                int sum = a.get(i) + a.get(minIndex) + a.get(maxIndex);
                if (sum == 0) {
                    results.add(new ArrayList<>(Arrays.asList(a.get(i), a.get(minIndex), a.get(maxIndex))));
                    // increase min index for the next possible solution.
                    minIndex++;
                    // skip duplicates.
                    while (minIndex - 1 >= i + 1 && a.get(minIndex - 1).equals(a.get(minIndex)) && minIndex < maxIndex) {
                        minIndex++;
                    }
                } else if (sum < 0) {
                    // increase sum by using a larger min.
                    minIndex++;
                    // skip duplicates.
                    while (minIndex - 1 >= i + 1 && a.get(minIndex - 1).equals(a.get(minIndex)) && minIndex < maxIndex) {
                        minIndex++;
                    }
                } else {
                    // decrease sum by using a smaller max.
                    maxIndex--;
                }
            }
        }
        return results;
    }
}