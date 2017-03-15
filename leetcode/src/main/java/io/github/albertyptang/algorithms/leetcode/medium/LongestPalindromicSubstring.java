package io.github.albertyptang.algorithms.leetcode.medium;

/**
 * 5. Longest Palindromic Substring
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * @author atang
 */
public class LongestPalindromicSubstring {

    public static String solve(final String s) {

        int longestLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            // check each letter as a potential palindrome midpoint.
            // if the next letter is the same, check the point between them as a potential palindrome midpoint.
            final int[] midpoints = (i + 1 < s.length()/*upper bound*/ && s.charAt(i) == s.charAt(i + 1))  ?
                new int[]{ i , i + 1 } : new int[]{ i };
            int offset = 0;
            for (int j = 0; j < midpoints.length; j++) {
                while (i - offset >= 0/*lower bound*/ && midpoints[j] + offset < s.length()/*upper bound*/
                    && s.charAt(i - offset) == s.charAt(midpoints[j] + offset)/*palindrome check*/) {
                    offset++; // increase the offset until you hit a restriction.
                }
                offset--; // set the offset back one after hitting a restriction.
                final int length = (midpoints[j] + offset) + 1 - (i - offset);
                if (length > longestLength) {
                    longestLength = length;
                    start = i - offset;
                }
            }
        }
        return s.substring(start/*inclusive*/, start + longestLength/*exclusive*/);
    }
}