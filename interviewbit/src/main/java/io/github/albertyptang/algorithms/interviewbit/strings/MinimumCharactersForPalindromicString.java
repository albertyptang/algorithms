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
        // start from the middle of the string and search for a starting palindrome that includes index 0.
        for (int i = A.length() / 2; i >= 0; i--) {
            if (startsWithPalindrome(i, A, false/* odd */)) {
                return Math.max(0, (A.length() - 1 - i) - i);
            } else if (startsWithPalindrome(i, A, true/* even */)) {
                return Math.max(0, (A.length() - i) - i);
            }
        }
        return A.length();
    }

    private static boolean startsWithPalindrome(final int index, final String string, final boolean even) {
        int max = index;
        int min = index;
        if (even) {
            if (index > 0 && string.charAt(index - 1) == string.charAt(index)) {
                min--;
            } else {
                return false;
            }
        }
        while (--min >= 0) {
            max++;
            if (max >= string.length() || string.charAt(min) != string.charAt(max) ) {
                return false;
            }
        }
        return true;
    }
}