package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class IdenticalBinaryTreesTest {
    @Test
    public void isSameTree() throws Exception {
        assertEquals(1, IdenticalBinaryTrees.isSameTree(
            TreeNodeBuilder.build(1, 2, 3), TreeNodeBuilder.build(1, 2, 3)
        ));

        assertEquals(0, IdenticalBinaryTrees.isSameTree(
            TreeNodeBuilder.build(1, 2, 3), TreeNodeBuilder.build(1, 2, 3, -1, 4)
        ));
    }

}