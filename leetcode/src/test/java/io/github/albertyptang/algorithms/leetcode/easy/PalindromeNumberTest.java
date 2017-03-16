package io.github.albertyptang.algorithms.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class PalindromeNumberTest {

    @Test
    public void isPalindrome() throws Exception {
        assertEquals("-1 is not a palindrome", false, PalindromeNumber.isPalindrome(-1));
        assertEquals("10 is not a palindrome", false, PalindromeNumber.isPalindrome(10));
        assertEquals("1000001 is a palindrome", true, PalindromeNumber.isPalindrome(1000001));
        assertEquals("Max integer is not a palindrome", false, PalindromeNumber.isPalindrome(Integer.MAX_VALUE));
        assertEquals("Min integer is not a palindrome", false, PalindromeNumber.isPalindrome(Integer.MIN_VALUE));
    }
}