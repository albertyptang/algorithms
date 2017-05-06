package io.github.albertyptang.algorithms.interviewbit.level_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p>
 * Example:
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 *
 * @author atang
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(final List<Integer> a) {
        int maxLength = 0;
        final Map<Integer, Integer> numToLength = new HashMap<>();

        for (final int n : a) {
            if (!numToLength.containsKey(n)) {
                // eg. 0 -> 1 -> 2 | 3 | 4 -> 5 -> 6
                // get lengths of any entry n can attach to.
                final int leftLength = numToLength.getOrDefault(n - 1/*tail of left*/, 0);
                final int rightLength = numToLength.getOrDefault(n + 1/*head of right*/, 0);

                final int totalLength = leftLength + 1 + rightLength;
                maxLength = Math.max(maxLength, totalLength);

                // update the head and tail of the new sequence with the new length.
                // no other entry in the sequence range needs to be updated because we skip duplicates,
                // so only the head or tail could ever be accessed.
                numToLength.put(n - leftLength, totalLength);
                numToLength.put(n + rightLength, totalLength);
            }
        }
        return maxLength;
    }
}
