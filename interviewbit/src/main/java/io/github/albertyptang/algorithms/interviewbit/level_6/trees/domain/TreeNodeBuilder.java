package io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author atang
 */
public class TreeNodeBuilder {

    public static TreeNode build(final int... array) {
        if (array.length < 1) {
            return null;
        }
        final TreeNode tree = new TreeNode(array[0]);
        final Queue<TreeNode> bfsQueue = new LinkedList<>();
        bfsQueue.offer(tree);
        int index = 0;
        while (bfsQueue.size() > 0 && index < array.length - 1) {
            final TreeNode node = bfsQueue.poll();
            final int leftVal = array[++index];
            final int rightVal = array[++index];
            if (leftVal != -1) {
                node.left = new TreeNode(leftVal);
                bfsQueue.offer(node.left);
            }
            if (rightVal != -1) {
                node.right = new TreeNode(rightVal);
                bfsQueue.offer(node.right);
            }
        }
        return tree;
    }
}
