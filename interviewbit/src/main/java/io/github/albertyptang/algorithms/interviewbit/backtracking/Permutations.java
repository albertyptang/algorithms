package io.github.albertyptang.algorithms.interviewbit.backtracking;

import java.util.ArrayList;

/**
 * Given a collection of numbers, return all possible permutations.
 * <p>
 * Example:
 * <p>
 * [1,2,3] will have the following permutations:
 * <p>
 * [1,2,3]
 * [1,3,2]
 * [2,1,3]
 * [2,3,1]
 * [3,1,2]
 * [3,2,1]
 * NOTE:
 * No two entries in the permutation sequence should be the same.
 * For the purpose of this problem, assume that all the numbers in the collection are unique.
 * Warning : DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
 *
 * @author atang
 */
public class Permutations {

    // 1, 2, 3, 4
    //
    // 1, 2, 3, 4
    // 1, 2, 4, 3
    // 1, 3, 2, 4
    // 1, 3, 4, 2
    // 1, 4, 2, 3
    // 1, 4, 3, 2

    public static ArrayList<ArrayList<Integer>> permute(final ArrayList<Integer> a) {
        return permuteRecursion(a, 0);
    }

    private static ArrayList<ArrayList<Integer>> permuteRecursion(final ArrayList<Integer> a,
                                                                  final int index) {
        if (index == a.size() - 1) {
            final ArrayList<ArrayList<Integer>> results = new ArrayList<>();
            final ArrayList<Integer> firstResult = new ArrayList<>();
            firstResult.add(a.get(index));
            results.add(firstResult);
            return results;
        }
        final ArrayList<ArrayList<Integer>> results = permuteRecursion(a, index + 1);
        final int num = a.get(index);
        final int initialSize = results.size();
        for (int i = 0; i < initialSize; i++) {
            final ArrayList<Integer> result = results.get(i);
            // add a new entry for every possible insertion of the current number besides the end.
            for (int j = 0; j < result.size(); j++) {
                final ArrayList<Integer> newResult = new ArrayList<>(result);
                newResult.add(j, num);
                results.add(newResult);
            }
            // add the number to the end of the existing result to save on memory usage.
            result.add(num);
        }
        return results;
    }
}