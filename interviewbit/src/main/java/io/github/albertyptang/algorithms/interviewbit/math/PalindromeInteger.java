package io.github.albertyptang.algorithms.interviewbit.math;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
 * Negative numbers are not palindromic.
 *
 * Example :
 *
 * Input : 12121
 * Output : True
 *
 * Input : 123
 * Output : False
 *
 * @author atang
 */
public class PalindromeInteger {

    public static boolean isPalindrome(final int a) {
        int aDigitsRemoved = a;
        int reversedADigitsAdded = 0;
        while (aDigitsRemoved > 0) {
            final int digit = aDigitsRemoved - aDigitsRemoved/10 * 10;
            // eg. (int) (123 / 10) * 10 = 120
            // digit = 123 - 120 = 3
            aDigitsRemoved /= 10; // remove digit.
            reversedADigitsAdded *= 10; // add digit.
            reversedADigitsAdded += digit; // add digit.
        }
        return a >= 0 && a == reversedADigitsAdded;
    }
}