package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import java.util.LinkedList;
import java.util.Queue;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;

/**
 * Given a binary tree, invert the binary tree and return it.
 * Look at the example for more details.
 *
 * Example :
 * Given binary tree
 *
 *      1
 *    /   \
 *   2     3
 *  / \   / \
 * 4   5 6   7
 * invert and return
 *
 *      1
 *    /   \
 *   3     2
 *  / \   / \
 * 7   6 5   4
 *
 * @author atang
 */
public class InvertBinaryTree {

    public static TreeNode invert(final TreeNode root) {
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            final TreeNode node = queue.poll();
            if (node != null) {
                queue.offer(node.left);
                queue.offer(node.right);
                final TreeNode oldLeft = node.left;
                node.left = node.right;
                node.right = oldLeft;
            }
        }
        return root;
    }
}
