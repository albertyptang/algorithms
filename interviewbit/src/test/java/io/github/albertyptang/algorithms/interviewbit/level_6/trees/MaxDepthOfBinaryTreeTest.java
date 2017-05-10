package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MaxDepthOfBinaryTreeTest {
    @Test
    public void maxDepth() throws Exception {
        assertEquals(3, MaxDepthOfBinaryTree.maxDepth(TreeNodeBuilder.build(1, 2, 3, -1, -1, -1, 4)));
    }
}