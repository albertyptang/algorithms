package io.github.albertyptang.algorithms.interviewbit.level_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Given an array, find the next greater element G[i] for every element A[i] in the array.
 * The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array.
 * More formally,
 * <p>
 * G[i] for an element A[i] = an element A[j] such that
 * j is minimum possible AND
 * j > i AND
 * A[j] > A[i]
 * Elements for which no greater element exist, consider next greater element as -1.
 * <p>
 * Example:
 * <p>
 * Input : A : [4, 5, 2, 10]
 * Output : [5, 10, 10, -1]
 * <p>
 * Example 2:
 * <p>
 * Input : A : [3, 2, 1]
 * Output : [-1, -1, -1]
 *
 * @author atang
 */
public class NextGreater {

    public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        final Stack<Integer> stack = new Stack<>();
        final Integer[] array = new Integer[a.size()];
        for (int i = 0; i < a.size(); i++) {
            final int value = a.get(i);
            while (stack.size() > 0 && a.get(stack.peek()) < value) {
                final int index = stack.pop();
                array[index] = value;
            }
            stack.push(i);
        }
        // replace null values (numbers that no following number was greater than) with -1.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = -1;
            }
        }
        return new ArrayList<>(Arrays.asList(array));
    }
}
