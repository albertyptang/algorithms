package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class PostorderTraversalTest {
    @Test
    public void postorderTraversal() throws Exception {
        final TreeNode tree = TreeNodeBuilder.build(1, -1, 2, 3, -1, -1, -1);
        assertEquals(new ArrayList<>(Arrays.asList(3, 2, 1)), PostorderTraversal.postorderTraversal(tree));

        final TreeNode tree2 = TreeNodeBuilder.build(1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1);
        assertEquals(new ArrayList<>(Arrays.asList(4, 5, 2, 3, 1)), PostorderTraversal.postorderTraversal(tree2));
    }
}