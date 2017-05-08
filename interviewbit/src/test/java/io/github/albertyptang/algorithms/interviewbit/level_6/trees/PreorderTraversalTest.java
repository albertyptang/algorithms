package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class PreorderTraversalTest {
    @Test
    public void preorderTraversal() throws Exception {
        final TreeNode tree = TreeNodeBuilder.build(1, -1, 2, 3, -1, -1, -1);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3)), PreorderTraversal.preorderTraversal(tree));

        final TreeNode tree2 = TreeNodeBuilder.build(1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3)), PreorderTraversal.preorderTraversal(tree2));
    }
}