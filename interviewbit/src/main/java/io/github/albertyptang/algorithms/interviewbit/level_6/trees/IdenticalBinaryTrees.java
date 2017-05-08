package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import java.util.LinkedList;
import java.util.Queue;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * <p>
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * <p>
 * Example :
 * <p>
 * Input :
 * <p>
 *   1       1
 *  / \     / \
 * 2   3   2   3
 * <p>
 * Output :
 * 1 or True
 *
 * @author atang
 */
public class IdenticalBinaryTrees {

    public static int isSameTree(final TreeNode a, final TreeNode b) {
        final Queue<TreeNode> queue = new LinkedList<>();
        final Queue<TreeNode> queue2 = new LinkedList<>();
        queue.offer(a);
        queue2.offer(b);
        while (queue.size() > 0 && queue2.size() > 0) {
            final TreeNode node = queue.poll();
            final TreeNode node2 = queue2.poll();
            if (node == null || node2 == null) {
                if (node != null || node2 != null) {
                    return 0;
                }
            } else if (node.val != node2.val) {
                return 0;
            } else {
                queue.offer(node.left);
                queue.offer(node.right);
                queue2.offer(node2.left);
                queue2.offer(node2.right);
            }
        }
        return 1;
    }
}
