package io.github.albertyptang.algorithms.interviewbit.strings;

import java.util.ArrayList;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
 *
 * As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 *
 * Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
 *
 * Example:
 *
 * Given the array as:
 *
 * [
 *
 * "abcdefgh",
 *
 * "aefghijk",
 *
 * "abcefgh"
 * ]
 * The answer would be “a”.
 *
 * @author atang
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(ArrayList<String> a) {
        final StringBuilder prefix = new StringBuilder();
        if (a.size() < 1) {
            return "";
        }
        for(int i = 0; i < a.get(0).length(); i++) {
            // look at every character in the first string.
            final char c = a.get(0).charAt(i);
            // compare it to every string in the array list.
            for (final String string : a) {
                if (string.length() - 1 < i || string.charAt(i) != c) {
                    // return current prefix upon finding an issue with one of the strings.
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
        return prefix.toString();
    }
}