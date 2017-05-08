package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * Height-balanced binary tree : is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * <p>
 * Example :
 * <p>
 * Input :
 *   1
 *  / \
 * 2   3
 * <p>
 * Return : True or 1
 * <p>
 * Input 2 :
 *     3
 *    /
 *   2
 *  /
 * 1
 * <p>
 * Return : False or 0
 * Because for the root node, left subtree has depth 2 and right subtree has depth 0.
 * Difference = 2 > 1.
 *
 * @author atang
 */
public class BalancedBinaryTree {
    public static int isBalanced(final TreeNode a) {
        final int height = getHeight(a);
        if (height == -1) {
            return 0;
        }
        return 1;
    }

    private static int getHeight(final TreeNode a) {
        if (a == null) {
            return 0;
        }
        final int leftHeight = getHeight(a.left);
        final int rightHeight = getHeight(a.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(rightHeight - leftHeight) > 1) {
            return -1; // error code.
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
