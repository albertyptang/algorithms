package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author atang
 */
public class MinDepthOfBinaryTree {
    public static int minDepth(TreeNode a) {
        int depth = 0;
        if (a == null) {
            return depth;
        }
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(a);
        depth++;
        queue.offer(new TreeNode(-2));
        while (queue.size() > 1) {
            final TreeNode node = queue.poll();
            if (node.val == -2) {
                depth++;
                queue.offer(node);
            } else {
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return depth;
    }
}
