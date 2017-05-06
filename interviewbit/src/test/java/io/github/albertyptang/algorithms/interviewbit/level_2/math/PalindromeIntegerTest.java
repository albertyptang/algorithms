package io.github.albertyptang.algorithms.interviewbit.level_2.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author atang
 */
public class PalindromeIntegerTest {
    @Test
    public void isPalindrome() throws Exception {
        assertTrue(PalindromeInteger.isPalindrome(12121));
        assertFalse(PalindromeInteger.isPalindrome(123));
        assertTrue(PalindromeInteger.isPalindrome(0));
        assertFalse(PalindromeInteger.isPalindrome(-12121));
    }
}