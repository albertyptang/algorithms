package io.github.albertyptang.algorithms.interviewbit.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MinimumCharactersForPalindromicStringTest {
    @Test
    public void solve() throws Exception {
        assertEquals("", 0, MinimumCharactersForPalindromicString.solve(""));
        assertEquals("a", 0, MinimumCharactersForPalindromicString.solve("a"));
        assertEquals("aa", 0, MinimumCharactersForPalindromicString.solve("aa"));
        assertEquals("aba", 0, MinimumCharactersForPalindromicString.solve("aba"));
        assertEquals("ABC", 2, MinimumCharactersForPalindromicString.solve("ABC"));
        assertEquals("AAC", 1, MinimumCharactersForPalindromicString.solve("AAC"));
        assertEquals("AACECAAAA", 2, MinimumCharactersForPalindromicString.solve("AACECAAAA"));
        assertEquals("AACEECAAAA", 2, MinimumCharactersForPalindromicString.solve("AACEECAAAA"));
    }
}