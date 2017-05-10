package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class ValidBstTest {
    @Test
    public void isValidBST() throws Exception {
        assertEquals(0, ValidBst.isValidBST(TreeNodeBuilder.build(4, 2, 5, 1, 5, -1, -1, -1, -1, -1, -1)));
    }
}