package io.github.albertyptang.algorithms.interviewbit.strings;

/**
 * You are given a string. The only operation allowed is to insert characters in the beginning of the string.
 * How many minimum characters are needed to be inserted to make the string a palindrome string
 *
 * Example:
 * Input: ABC
 * Output: 2
 * Input: AACECAAAA
 * Output: 2
 *
 * @author atang
 */
public class MinimumCharactersForPalindromicString {

    public static int solve(String A) {
        for (int i = A.length()/2; i >= 0; i--) {
            if (startsWithPalindrome(i, A) || i == 0) {
                return i + 1 < A.length() && A.charAt(i) == A.charAt(i + 1) ?
                    Math.max(0, (A.length() - 1 - i) - i - 1) : Math.max(0, (A.length() - 1 - i) - i);
            }
        }
        return A.length();
    }

    private static boolean startsWithPalindrome(final int index, final String string) {
        if (index > string.length() / 2) {
            return false;
        }
        int max = index;
        int min = index;
        while (--min >= 0) {
            max++;
            if (max >= string.length() || string.charAt(min) != string.charAt(max) ) {
                return false;
            }
        }
        return true;
    }
}