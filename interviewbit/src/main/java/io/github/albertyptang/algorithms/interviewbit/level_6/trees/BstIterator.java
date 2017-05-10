package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import java.util.Stack;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * <p>
 * The first call to next() will return the smallest number in BST. Calling next() again will return the next smallest number in the BST, and so on.
 * <p>
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * Try to optimize the additional space complexity apart from the amortized time complexity.
 *
 * @author atang
 */
public class BstIterator {

    //     6
    //    /
    //   3
    //  / \
    // 2   5
    //    /
    //   4
    private Stack<TreeNode> nodes = new Stack<>();

    /**
     * Your Solution will be called like this:
     * Solution i = new Solution(root);
     * while (i.hasNext()) System.out.print(i.next());
     */
    public BstIterator(final TreeNode root) {
        TreeNode iterator = root;
        while (iterator != null) {
            nodes.push(iterator);
            iterator = iterator.left;
        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return nodes.size() > 0;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        if (hasNext()) {
            final TreeNode least = nodes.pop();
            TreeNode iterator = least.right;
            while (iterator != null) {
                nodes.push(iterator);
                iterator = iterator.left;
            }
            return least.val;
        }
        return -1;
    }
}
