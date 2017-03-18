package io.github.albertyptang.algorithms.leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class RegularExpressionMatchingTest {

    @Test
    public void testChar() throws Exception {
        assertEquals("blank strings", true, RegularExpressionMatching.isMatch("", ""));
        assertEquals("abc = abc", true, RegularExpressionMatching.isMatch("aa", "aa"));
        assertEquals("abc = abb", false, RegularExpressionMatching.isMatch("aaa", "aa"));
    }

    @Test
    public void testDot() throws Exception {
        assertEquals("abc = a.c", true, RegularExpressionMatching.isMatch("abc", "a.c"));
        assertEquals("abc = ...", true, RegularExpressionMatching.isMatch("abc", "..."));
        assertEquals(". = .", true, RegularExpressionMatching.isMatch(".", "."));
        assertEquals("* = .", true, RegularExpressionMatching.isMatch("*", "."));
        assertEquals("abc = a.bc", false, RegularExpressionMatching.isMatch("abc", "a.bc"));
    }

    @Test
    public void testStar() throws Exception {
        assertEquals("* = *", false, RegularExpressionMatching.isMatch("*", "*"));
        assertEquals("* = **", true, RegularExpressionMatching.isMatch("*", "**"));
        assertEquals("** = *****", true, RegularExpressionMatching.isMatch("**", "*****"));
        assertEquals("*a = *a", true, RegularExpressionMatching.isMatch("*a", "*a"));
        assertEquals("a* = a*", false, RegularExpressionMatching.isMatch("a*", "a*"));
        assertEquals("aaa* = a**", true, RegularExpressionMatching.isMatch("aaa*", "a**"));
        assertEquals("aab = c*a*b", true, RegularExpressionMatching.isMatch("aab", "c*a*b"));
        assertEquals("empty string = a*b*c*", true, RegularExpressionMatching.isMatch("", "a*b*c*"));
    }

    @Test
    public void testDotStar() throws Exception {
        assertEquals("a = .*..a*", false, RegularExpressionMatching.isMatch("a", ".*..a*"));
        assertEquals("abcdefg.* = .*", true, RegularExpressionMatching.isMatch("abcdefg.*", ".*"));
        assertEquals("abcdefg.* = .**", true, RegularExpressionMatching.isMatch("abcdefg.*", ".**"));
    }
}