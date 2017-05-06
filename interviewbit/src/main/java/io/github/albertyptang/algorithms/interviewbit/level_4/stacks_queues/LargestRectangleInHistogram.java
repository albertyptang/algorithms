package io.github.albertyptang.algorithms.interviewbit.level_4.stacks_queues;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given n non-negative integers representing the histogram’s bar height where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 * <p>
 * For example,
 * Given height = [2,1,5,6,2,3],
 * return 10.
 *
 * @author atang
 */
public class LargestRectangleInHistogram {

    // the idea is that the largest rectangle will have its height capped by of one of the histograms.
    // thus for every histogram, assume it is the height cap and find the size of that rectangle (the width of which
    // is determined by the left and right histogram of lower height).
    public static int largestRectangleArea(final ArrayList<Integer> a) {
        int max = 0;
        final Stack<Integer> indexStack = new Stack<>();
        // account for the end of the array as a right cap by iterating to a.size().
        for (int i = 0; i <= a.size(); i++) {
            if (i < a.size() && (indexStack.size() < 1 || a.get(i) >= a.get(indexStack.peek()))) {
                // record indices of ascending or equal histograms. these are potential left rectangle caps.
                indexStack.push(i);
            } else if (i == a.size() || a.get(i) < a.get(indexStack.peek())) {
                // hit the right rectangle cap, where a previous histogram rectangle ends.
                // calculate areas for all histogram rectangles that end at this point.
                while (indexStack.size() > 0 && (i == a.size() || a.get(i) < a.get(indexStack.peek()))) {
                    final int height = a.get(indexStack.pop());
                    final int left = indexStack.size() > 0 ? indexStack.peek() : -1;
                    final int right = i;
                    max = Math.max(max, height * (right - left - 1));
                }
                indexStack.push(i);
            }
        }
        return max;
    }
}
