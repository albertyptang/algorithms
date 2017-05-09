package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class BalancedBinaryTreeTest {
    @Test
    public void isBalanced() throws Exception {
        assertEquals(1, BalancedBinaryTree.isBalanced(TreeNodeBuilder.build(1, 2, 3)));
        assertEquals(0, BalancedBinaryTree.isBalanced(TreeNodeBuilder.build(3, 2, -1, 1, -1)));
    }
}