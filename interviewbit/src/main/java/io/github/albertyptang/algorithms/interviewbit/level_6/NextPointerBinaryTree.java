package io.github.albertyptang.algorithms.interviewbit.level_6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree
 * <p>
 * struct TreeLinkNode {
 * TreeLinkNode *left;
 * TreeLinkNode *right;
 * TreeLinkNode *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * <p>
 * Initially, all next pointers are set to NULL.
 * <p>
 * Note:
 * You may only use constant extra space.
 * Example :
 * <p>
 * Given the following binary tree,
 * <p>
 *      1
 *    /  \
 *   2    3
 *  / \  / \
 * 4  5  6  7
 * After calling your function, the tree should look like:
 * <p>
 *      1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \  / \
 * 4->5->6->7 -> NULL
 * Note 1: that using recursion has memory overhead and does not qualify for constant space.
 * Note 2: The tree need not be a perfect binary tree.
 *
 * @author atang
 */
public class NextPointerBinaryTree {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public void connect(TreeLinkNode root) {
        final Queue<TreeLinkNode> bfsQueue = new LinkedList<>();
        bfsQueue.offer(root);
        bfsQueue.offer(new TreeLinkNode(-2));
        TreeLinkNode rightNode = null;
        while (bfsQueue.size() > 1) {
            final TreeLinkNode node = bfsQueue.poll();
            if (node.val == -2) {
                bfsQueue.offer(node);
                rightNode = null; // reset
            } else {
                if (node.right != null) {
                    bfsQueue.offer(node.right);
                }
                if (node.left != null) {
                    bfsQueue.offer(node.left);
                }
                if (rightNode != null) {
                    node.next = rightNode;
                }
                rightNode = node;
            }
        }
    }
}
