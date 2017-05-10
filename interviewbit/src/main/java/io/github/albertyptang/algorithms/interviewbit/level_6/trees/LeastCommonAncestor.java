package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import java.util.Stack;

/**
 * Find the lowest common ancestor in an unordered binary tree given two values in the tree.
 * <p>
 * Lowest common ancestor : the lowest common ancestor (LCA) of two nodes v and w in a tree or directed acyclic graph (DAG) is the lowest (i.e. deepest) node that has both v and w as descendants.
 * Example :
 * <p>
 * <p>
 *        _______3______
 *       /              \
 *   ___5__          ___1__
 *  /      \        /      \
 * 6      _2_      0        8
 *       /   \
 *      7    4
 * For the above tree, the LCA of nodes 5 and 1 is 3.
 * <p>
 * LCA = Lowest common ancestor
 * Please note that LCA for nodes 5 and 4 is 5.
 * <p>
 * You are given 2 values. Find the lowest common ancestor of the two nodes represented by val1 and val2
 * No guarantee that val1 and val2 exist in the tree. If one value doesn’t exist in the tree then return -1.
 * There are no duplicate values.
 * You can use extra memory, helper functions, and can modify the node struct but, you can’t add a parent pointer.
 *
 * @author atang
 */
public class LeastCommonAncestor {
    public static int lca(TreeNode a, int val1, int val2) {
        int lca = -1;
        final Stack<Integer> val1Parents = new Stack<>();
        final Stack<Integer> val2Parents = new Stack<>();
        if (findParents(a, val1, val1Parents) == -1) {
            return lca;
        }
        if (findParents(a, val2, val2Parents) == -1) {
            return lca;
        }
        while (val1Parents.size() > 0 && val2Parents.size() > 0) {
            final int parent1 = val1Parents.pop();
            final int parent2 = val2Parents.pop();
            if (parent1 == parent2) {
                lca = parent1;
            } else {
                break;
            }
        }
        return lca;
    }

    private static int findParents(final TreeNode a, final int val, final Stack<Integer> parents) {
        if (a != null) {
            if (a.val == val) {
                parents.push(val);
                return val;
            } else if (findParents(a.left, val, parents) == val) {
                parents.push(a.val);
                return val;
            } else if (findParents(a.right, val, parents) == val) {
                parents.push(a.val);
                return val;
            }
        }
        return -1;
    }
}
