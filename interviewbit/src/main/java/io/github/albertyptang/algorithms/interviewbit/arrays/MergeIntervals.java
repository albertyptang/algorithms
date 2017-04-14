package io.github.albertyptang.algorithms.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 *
 * You may assume that the intervals were initially sorted according to their start times.
 *
 * Example 1:
 *
 * Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
 *
 * Example 2:
 *
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
 *
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 *
 * Make sure the returned intervals are also sorted.
 *
 * @author atang
 */
public class MergeIntervals {

    public static class Interval {
        int start;
        int end;
        Interval() {
            start = 0;
            end = 0;
        }
        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static ArrayList<Interval> insert(final ArrayList<Interval> intervals, final Interval newInterval) {
        final int insertStart = Math.min(newInterval.start, newInterval.end);
        final int insertEnd = Math.max(newInterval.start, newInterval.end);
        boolean inserting = false;
        boolean inserted = false;

        for (int i = 0; i < intervals.size(); i++) {
            if (inserted) {
                break;
            }
            final Interval interval = intervals.get(i);
            if (inserting) { // looking for a place to end.
                if (insertEnd < interval.start) { // outside the range of this interval.
                    intervals.get(i-1).end = Math.max(insertEnd, intervals.get(i-1).end); // alter the previous interval.
                    inserted = true;
                    inserting = false;
                } else if (insertEnd > interval.end){
                    intervals.remove(interval); // remove this interval.
                    i--; // change index to account for removal.
                } else { // end is within interval.
                    intervals.get(i-1).end = Math.max(insertEnd, interval.end);
                    intervals.remove(interval); // remove this interval.
                    i--;
                    inserted = true;
                    inserting = false;
                }
            } else if (insertStart <= interval.end) {
                inserting = true;
                // if the start is before this interval (if not, it is within this interval).
                if (insertStart < interval.start) {
                    if (insertEnd < interval.start) {
                        // if the end date is also before the start, create a new entry.
                        intervals.add(i, newInterval);
                        i++;
                        inserted = true;
                        inserting = false;
                    } else {
                        // else, alter this interval.
                        interval.start = insertStart;
                    }
                }
            }
        }

        if (!inserted) {
            if (inserting) {
                intervals.get(intervals.size() - 1).end = insertEnd;
            } else {
                intervals.add(newInterval);
            }
        }
        return intervals;
    }
}
