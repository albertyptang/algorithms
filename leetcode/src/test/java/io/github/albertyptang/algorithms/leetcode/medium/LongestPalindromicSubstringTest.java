package io.github.albertyptang.algorithms.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class LongestPalindromicSubstringTest {
    @Test
    public void solve() throws Exception {

        assertEquals("a", LongestPalindromicSubstring.solve("a"));

        assertEquals("bab", LongestPalindromicSubstring.solve("babad"));

        assertEquals("bb", LongestPalindromicSubstring.solve("cbbd"));
    }
}