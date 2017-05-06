package io.github.albertyptang.algorithms.interviewbit.level_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * <p>
 * Example :
 * [1,1,2] have the following unique permutations:
 * <p>
 * [1,1,2]
 * [1,2,1]
 * [2,1,1]
 * NOTE : No 2 entries in the permutation sequence should be the same.
 * Warning : DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
 *
 * @author atang
 */
public class AllUniquePermutations {
    public static ArrayList<ArrayList<Integer>> permute(final ArrayList<Integer> a) {
        final Set<ArrayList<Integer>> results = new HashSet<>();
        permuteRecursion(a, new ArrayList<>(), results, new HashSet<>());
        return new ArrayList<>(results);
    }

    private static void permuteRecursion(final ArrayList<Integer> a,
                                         final ArrayList<Integer> result,
                                         final Set<ArrayList<Integer>> results,
                                         final Set<Integer> indices) {
        if (result.size() < a.size()) {
            for (int i = 0; i < a.size(); i++) {
                if (!indices.contains(i)) {
                    final int value = a.get(i);
                    final ArrayList<Integer> clone = new ArrayList<>(result);
                    final Set<Integer> clonedIndices = new HashSet<>(indices);
                    clonedIndices.add(i);
                    clone.add(value);
                    permuteRecursion(a, clone, results, clonedIndices);
                }
            }
        } else {
            results.add(result);
        }
    }
}
