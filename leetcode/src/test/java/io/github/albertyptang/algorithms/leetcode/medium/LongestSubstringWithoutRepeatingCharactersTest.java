package io.github.albertyptang.algorithms.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() throws Exception {

        assertEquals("pwwkew", 3, LongestSubstringWithoutRepeatingCharacters.solve("pwwkew"));

        assertEquals("c", 1, LongestSubstringWithoutRepeatingCharacters.solve("c"));

        assertEquals("cdd", 2, LongestSubstringWithoutRepeatingCharacters.solve("cdd"));

        assertEquals("dvdf", 3, LongestSubstringWithoutRepeatingCharacters.solve("dvdf"));
    }

}
