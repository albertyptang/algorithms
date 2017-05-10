package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node’s key.
 * The right subtree of a node contains only nodes with keys greater than the node’s key.
 * Both the left and right subtrees must also be binary search trees.
 * Example :
 * <p>
 * Input :
 *   1
 *  / \
 * 2   3
 * <p>
 * Output : 0 or False
 * <p>
 * <p>
 * Input :
 *   2
 *  / \
 * 1   3
 * <p>
 * Output : 1 or True
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 *
 * @author atang
 */
public class ValidBst {

    private static class Validity {
        private final int min;
        private final int max;
        private final int validity;

        public Validity(int min, int max, int validity) {
            this.min = min;
            this.max = max;
            this.validity = validity;
        }
    }

    public static int isValidBST(TreeNode a) {
        return getValidity(a).validity;
    }

    private static Validity getValidity(TreeNode a) {
        int validity = 1;
        int min = a.val;
        int max = a.val;
        if (a.left != null) {
            final Validity left = getValidity(a.left);
            if (left.max >= a.val || left.validity == 0) {
                validity = 0;
            }
            min = Math.min(min, left.min);
            max = Math.max(max, left.max);
        }
        if (a.right != null) {
            final Validity right = getValidity(a.right);
            if (right.min <= a.val || right.validity == 0) {
                validity = 0;
            }
            min = Math.min(min, right.min);
            max = Math.max(max, right.max);
        }
        return new Validity(min, max, validity);
    }
}
