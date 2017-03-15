package io.github.albertyptang.algorithms.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() throws Exception {

        assertEquals("pwwkew", 3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));

        assertEquals("c", 1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("c"));

        assertEquals("cdd", 2, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("cdd"));

        assertEquals("dvdf", 3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"));
    }

}
