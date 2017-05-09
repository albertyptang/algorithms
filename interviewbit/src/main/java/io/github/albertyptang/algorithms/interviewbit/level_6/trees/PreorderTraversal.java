package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Given a binary tree, return the preorder traversal of its nodes’ values.
 * <p>
 * Example :
 * Given binary tree
 * <p>
 * 1
 *  \
 *   2
 *  /
 * 3
 * return [1,2,3].
 * <p>
 * Using recursion is not allowed.
 *
 * @author atang
 */
public class PreorderTraversal {
    public static ArrayList<Integer> preorderTraversal(final TreeNode a) {
        final ArrayList<Integer> results = new ArrayList<>();
        final Stack<TreeNode> stack = new Stack<>();
        stack.push(a);
        while (!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            if (node == null) {
                continue;
            }
            results.add(node.val);
            stack.push(node.right);
            stack.push(node.left); // add left later so stack.pop() returns left first.
        }
        return results;
    }
}
