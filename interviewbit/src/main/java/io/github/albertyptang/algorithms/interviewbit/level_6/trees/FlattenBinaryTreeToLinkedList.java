package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import java.util.Stack;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * Example :
 * Given
 * <p>
 * <p>
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * The flattened tree should look like:
 * <p>
 * 1
 *  \
 *  2
 *   \
 *   3
 *    \
 *    4
 *     \
 *     5
 *      \
 *      6
 * Note that the left child of all nodes should be NULL.
 *
 * @author atang
 */
public class FlattenBinaryTreeToLinkedList {
    public static TreeNode flatten(TreeNode a) {
        final Stack<TreeNode> stack = new Stack<>();
        TreeNode pointer = a;
        while (pointer != null) {
            if (pointer.right != null) {
                stack.push(pointer.right); // temporarily store original right.
            }
            pointer.right = pointer.left; // put left onto the right.
            pointer.left = null;
            if (pointer.right == null && stack.size() > 0) {
                pointer.right = stack.pop(); // put original right back.
            }
            pointer = pointer.right;
        }
        return a;
    }
}
