package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the intersection of two sorted arrays.
 * OR in other words,
 * Given 2 sorted arrays, find all the elements which occur in both the arrays.
 * <p>
 * Example :
 * <p>
 * Input :
 * A : [1 2 3 3 4 5 6]
 * B : [3 3 5]
 * <p>
 * Output : [3 3 5]
 * <p>
 * Input :
 * A : [1 2 3 3 4 5 6]
 * B : [3 5]
 * <p>
 * Output : [3 5]
 * NOTE : For the purpose of this problem ( as also conveyed by the sample case ),
 * assume that elements that appear more than once in both arrays should be included multiple times in the final output.
 *
 * @author atang
 */
public class IntersectionOfSortedArrays {
    // DO NOT MODIFY THE LISTS
    public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        final ArrayList<Integer> intersection = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            final int aValue = a.get(i);
            while (b.get(j) < aValue && j < b.size() - 1) {
                j++;
            }
            if (b.get(j).equals(aValue)) {
                intersection.add(aValue);
                j++;
            }
            if (j >= b.size()) {
                break;
            }
        }
        return intersection;
    }
}
