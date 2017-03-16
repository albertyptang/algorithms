package io.github.albertyptang.algorithms.leetcode.medium;

import io.github.albertyptang.algorithms.util.collection.array.HashTable;

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * @author atang
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int solve(final String s) {
        final HashTable<Character,Integer> charToIndex = new HashTable<Character, Integer>();
        int start = 0;
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            // check if the same character exists in the current substring.
            if ((charToIndex.containsKey(c) && charToIndex.get(c) >= start)) {
                // record length of the substring from current character to repeat index.
                longest = Math.max(longest, i - start);
                // update start index to point to the character after the repeat.
                start = charToIndex.get(c) + 1;
            }
            // record last occurence of the character.
            charToIndex.put(c,i);
        }
        // account for the remainder of the string.
        return Math.max(longest, s.length() - start);
    }
}
