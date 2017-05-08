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
        while (stack.size() > 0) {
            traverse(stack, results);
        }
        return results;
    }

    private static void traverse(final Stack<TreeNode> stack, final ArrayList<Integer> results) {
        final TreeNode a = stack.peek();
        if (a.val != -1) {
            results.add(a.val);
            a.val = -1; // mark node as already traversed.
        } else if (a.left != null) {
            stack.push(a.left);
            a.left = null; // mark left as already added.
        } else if (a.right != null) {
            stack.push(a.right);
            a.right = null; // mark right as already added.
        } else {
            stack.pop();
        }
    }
}
