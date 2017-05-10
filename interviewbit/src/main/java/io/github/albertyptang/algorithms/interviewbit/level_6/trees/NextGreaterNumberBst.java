package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import java.util.Stack;

/**
 * Given a BST node, return the node which has value just greater than the given node.
 * <p>
 * Example:
 * <p>
 * Given the tree
 * <p>
 *     100
 *    /   \
 *   98   102
 *  /  \
 * 96  99
 *  \
 *  97
 * Given 97, you should return the node corresponding to 98 as thats the value just greater than 97 in the tree.
 * If there are no successor in the tree ( the value is the largest in the tree, return NULL).
 * <p>
 * Using recursion is not allowed.
 * <p>
 * Assume that the value is always present in the tree.
 *
 * @author atang
 */
public class NextGreaterNumberBst {
    public static TreeNode getSuccessor(TreeNode a, int b) {

        final Stack<TreeNode> stack = new Stack<>();

        TreeNode iterator = a;
        while (iterator != null) {
            if (iterator.val == b) {
                if (iterator.right != null) {
                    TreeNode lowestRight = iterator.right;
                    while (lowestRight.left != null) {
                        lowestRight = lowestRight.left;
                    }
                    return lowestRight;
                } else if (stack.size() > 0) {
                    return stack.pop();
                } else {
                    return null;
                }
            } else if (iterator.val > b) {
                stack.push(iterator);
                iterator = iterator.left;
            } else {
                iterator = iterator.right;
            }
        }
        return null;
    }
}
