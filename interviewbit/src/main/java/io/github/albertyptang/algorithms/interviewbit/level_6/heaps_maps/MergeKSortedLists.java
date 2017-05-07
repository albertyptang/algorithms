package io.github.albertyptang.algorithms.interviewbit.level_6.heaps_maps;

import io.github.albertyptang.algorithms.interviewbit.level_4.linked_lists.domain.ListNode;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list.
 * <p>
 * Example :
 * <p>
 * 1 -> 10 -> 20
 * 4 -> 11 -> 13
 * 3 -> 8 -> 9
 * will result in
 * <p>
 * 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20
 *
 * @author atang
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(final ArrayList<ListNode> a) {
        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode list : a) {
            while (list != null) {
                pq.offer(list.val);
                list = list.next;
            }
        }
        final ListNode list = new ListNode(pq.poll());
        ListNode listPointer = list;
        while (pq.size() > 0) {
            listPointer.next = new ListNode(pq.poll());
            listPointer = listPointer.next;
        }
        return list;
    }
}
