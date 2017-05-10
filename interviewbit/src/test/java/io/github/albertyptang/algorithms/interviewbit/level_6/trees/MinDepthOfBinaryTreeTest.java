package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class MinDepthOfBinaryTreeTest {
    @Test
    public void minDepth() throws Exception {
        assertEquals(2, MinDepthOfBinaryTree.minDepth(TreeNodeBuilder.build(1, 2, 3, -1, -1, -1, 4)));
    }
}