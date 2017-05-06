package io.github.albertyptang.algorithms.interviewbit.level_5.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in linear time complexity.
 * Note that when the count of a character C in T is N, then the count of C in minimum window in S should be at least N.
 * <p>
 * Example :
 * <p>
 * S = "ADOBECODEBANC"
 * T = "ABC"
 * Minimum window is "BANC"
 * <p>
 * Note:
 * If there is no such window in S that covers all characters in T, return the empty string ''.
 * If there are multiple such windows, return the first occurring minimum window ( with minimum start index ).
 *
 * @author atang
 */
public class WindowString {
    public static String minWindow(final String S, final String T) {

        boolean windowFound = false;
        int windowStart = 0;
        int windowEnd = Integer.MAX_VALUE;

        // map of characters in T to occurrence.
        final Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            final char c = T.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        final Set<Character> charSet = new HashSet<>(charMap.keySet());

        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            final char c = S.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) - 1);
                if (charMap.get(c) == 0) {
                    charSet.remove(c);
                }
                while (charSet.size() == 0 && start <= i) { // found all chars.
                    windowFound = true;
                    final char startC = S.charAt(start);
                    if (charMap.containsKey(startC)) {
                        charMap.put(startC, charMap.get(startC) + 1);
                        if (charMap.get(startC) > 0) { // hit the point where chars to cover are left.
                            charSet.add(startC);
                            if (i - start < windowEnd - windowStart) {
                                windowEnd = i;
                                windowStart = start;
                            }
                        }
                    }
                    start++;
                }
            }
        }
        return windowFound ? S.substring(windowStart, windowEnd + 1) : "";
    }
}
