package io.github.albertyptang.algorithms.interviewbit.level_6.heaps_maps;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;
import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNodeBuilder;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class MergeKSortedListsTest {
    @Test
    public void mergeKLists() throws Exception {
        ListNode result = ListNodeBuilder.build(1, 3, 4, 8, 9, 10, 11, 13, 20);
        ListNode testResult = MergeKSortedLists.mergeKLists(new ArrayList<>(Arrays.asList(
            ListNodeBuilder.build(1, 10, 20),
            ListNodeBuilder.build(4, 11, 13),
            ListNodeBuilder.build(3, 8, 9)
        )));

        while (result != null) {
            assertEquals(result.val, testResult.val);
            result = result.next;
            testResult = testResult.next;
        }
    }
}