package io.github.albertyptang.algorithms.interviewbit.level_6;

import java.util.ArrayList;

/**
 * Given an array A, count the number of inversions in the array.
 * <p>
 * Formally speaking, two elements A[i] and A[j] form an inversion if A[i] > A[j] and i < j
 * <p>
 * Example:
 * <p>
 * A : [2, 4, 1, 3, 5]
 * Output : 3
 * as the 3 inversions are (2, 1), (4, 1), (4, 3).
 *
 * @author atang
 */
public class Inversions {

    private static class BstNode {
        public int val;
        public BstNode left;
        public BstNode right;
        public int leftNodes = 0;

        public BstNode(int x) {
            val = x;
        }
    }

    public static int countInversions(ArrayList<Integer> a) {
        int count = 0;

        // 6, 2, 4, 1, 3, 5
        //
        // iterate backwards so that every entry with a higher index has already been added.
        // count the number of nodes on its left.
        //
        //     5
        //    /
        //   3
        //  / \
        // 1   4 (2)
        //
        //     5
        //    /
        //   3
        //  / \
        // 1   4
        //  \
        //   2 (1)
        //
        //     5
        //    / \
        //   3   6 (5)
        //  / \
        // 1   4
        //  \
        //   2
        //
        // to do this, on every insert traversal, keep track of the number of nodes on its left.
        final BstNode bst = new BstNode(a.get(a.size() - 1));
        for (int i = a.size() - 2; i >= 0; i--) {
            BstNode pointer = bst;
            final int value = a.get(i);
            while (true) {
                if (pointer.val < value) {
                    // found an inversion!
                    // add to count.
                    count += pointer.leftNodes + 1;
                    if (pointer.right == null) {
                        pointer.right = new BstNode(value);
                        break;
                    } else {
                        pointer = pointer.right;
                    }
                } else {
                    // one more node on the pointer node's left subtree.
                    pointer.leftNodes++;
                    if (pointer.left == null) {
                        pointer.left = new BstNode(value);
                        break;
                    } else {
                        pointer = pointer.left;
                    }
                }
            }
        }
        return count;
    }
}
