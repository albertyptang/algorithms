package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class LeastCommonAncestorTest {
    @Test
    public void lca() throws Exception {
        final TreeNode tree = TreeNodeBuilder.build(3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4);
        assertEquals(3, LeastCommonAncestor.lca(tree, 7, 8));
        assertEquals(5, LeastCommonAncestor.lca(tree, 4, 5));
        assertEquals(-1, LeastCommonAncestor.lca(tree, 10, 3));
    }
}