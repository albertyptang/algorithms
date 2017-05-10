package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class BstIteratorTest {
    @Test
    public void test() throws Exception {
        final BstIterator iterator = new BstIterator(TreeNodeBuilder.build(2, 1, -1, -1, -1));
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(false, iterator.hasNext());

        final BstIterator iterator2 = new BstIterator(TreeNodeBuilder.build(
            4, 2, 9, 1, 3, 8, 11, -1, -1, -1, -1, 7, -1, 10, 12, 5, -1, -1, -1, -1, 13, -1, 6, -1, -1, -1, -1
        ));
        final List<Integer> list = new ArrayList<>();
        while (iterator2.hasNext()) {
            list.add(iterator2.next());
        }
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)), list);
    }
}