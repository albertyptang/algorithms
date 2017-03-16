package io.github.albertyptang.algorithms.leetcode.easy;

/**
 * 9. Palindrome Number
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * @author atang
 */
public class PalindromeNumber {

    /**
     * @see ReverseInteger#reverse(int)
     */
    public static boolean isPalindrome(final int x) {
        // negatives cannot be palindromes.
        return x > -1 && x == ReverseInteger.reverse(x);
    }
}