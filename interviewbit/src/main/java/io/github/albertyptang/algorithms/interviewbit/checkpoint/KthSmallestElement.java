package io.github.albertyptang.algorithms.interviewbit.checkpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Find the kth smallest element in an unsorted array of non-negative integers.
 *
 * Definition of kth smallest element
 *
 * kth smallest element is the minimum possible n such that there are at least k elements in the array <= n.
 * In other words, if the array A was sorted, then A[k - 1] ( k is 1 based, while the arrays are 0 based )
 * NOTE
 * You are not allowed to modify the array ( The array is read only ).
 * Try to do it using constant extra space.
 *
 * Example:
 *
 * A : [2 1 4 3 2]
 * k : 3
 *
 * answer : 2
 *
 * @author atang
 */
public class KthSmallestElement {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int kthsmallest(final List<Integer> a, final int k) {
        final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k + 1, Collections.reverseOrder());
        for(int i : a) {
            // only add to a full max heap if the number is less than or equal.
            if (maxHeap.size() <=k || i <= maxHeap.peek()) {
                maxHeap.offer(i);
                // save memory by removing heap entries.
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();
    }
}
