package io.github.albertyptang.algorithms.interviewbit.level_3.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh"));
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(a));
    }

}