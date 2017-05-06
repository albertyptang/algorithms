package io.github.albertyptang.algorithms.interviewbit.level_5.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a set of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The combinations themselves must be sorted in ascending order.
 * CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR … (a1 = b1 AND a2 = b2 AND … ai = bi AND ai+1 > bi+1)
 * The solution set must not contain duplicate combinations.
 * <p>
 * Example,
 * Given candidate set 2,3,6,7 and target 7,
 * A solution set is:
 * [2, 2, 3]
 * [7]
 * <p>
 * Warning : DO NOT USE LIBRARY FUNCTION FOR GENERATING COMBINATIONS.
 * Example : itertools.combinations in python.
 *
 * @author atang
 */
public class CombinationSum {
    public static ArrayList<ArrayList<Integer>> combinationSum(final ArrayList<Integer> a, final int b) {
        final ArrayList<ArrayList<Integer>> results = new ArrayList<>();

        // remove duplicates and sort.
        final Set<Integer> set = new HashSet<>(a);
        final ArrayList<Integer> dedupedA = new ArrayList<>(set);
        Collections.sort(dedupedA);

        combinationSumRecursion(dedupedA, b, 0, 0, new ArrayList<>(), results);
        return results;
    }

    private static void combinationSumRecursion(final ArrayList<Integer> a, final int target, final int index, final int sum,
                                                final ArrayList<Integer> result, final ArrayList<ArrayList<Integer>> results) {
        for (int i = index; i < a.size(); i++) {
            final int value = a.get(i);
            final int newSum = sum + a.get(i);
            final ArrayList<Integer> newResult = new ArrayList<>(result);
            newResult.add(value);
            if (newSum == target) {
                results.add(newResult);
            } else if (newSum < target) {
                combinationSumRecursion(a, target, i, newSum, newResult, results);
            } else {
                // since a is now sorted, if this new sum is larger, every sum after will be too.
                break;
            }
        }
    }
}
