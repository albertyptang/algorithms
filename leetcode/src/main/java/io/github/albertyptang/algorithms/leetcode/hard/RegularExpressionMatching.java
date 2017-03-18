package io.github.albertyptang.algorithms.leetcode.hard;

/**
 * 10. Regular Expression Matching
 *
 * Implement regular expression matching with support for '.' and '*'.
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 *
 * The matching should cover the entire input string (not partial).
 *
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 *
 * @author atang
 */
public class RegularExpressionMatching {

    /**
     * after running test cases:
     * @param s input string.
     * @param p regular expression string. supports metacharacters '.' and '*'.
     *          does not fully support normal characters '.' and '*'.
     *          '.' matches any character. '*' matches zero or more of the preceding element.
     *          p = "*" will return false.
     *          p = "*a" will match "*a".
     *          p = "**" will match s = "*****".  any additional '*' is redundant.
     *          p = "a**" will match s ="aaaaa*"
     *          p = "a***" will match s = "aaaaa*****".  any additional '*' is redundant.
     *          '.*' will match any character string.
     * @return whether they match.
     */
    public static boolean isMatch(final String s, final String p) {
        return isMatch(s, 0, p, 0);
    }

    /**
     * recursively check every char starting from sIndex and pIndex until the match fails or succeeds.
     * @param s input string.
     * @param sIndex current index at s.
     * @param p regular expression string.
     * @param pIndex current index at p.
     * @see #isMatch(String, String)
     */
    private static boolean isMatch(final String s, final int sIndex, final String p, final int pIndex) {

        // just finished looking at the last char in p.  check if s still has letters remaining.
        // NOTE : even after s has ended, additional p characters may still be valid.
        if (pIndex == p.length()) {
            return sIndex == s.length();
        }
        final char pc = p.charAt(pIndex);

        // REMINDER : p = "*" will return false.
        if (pc == '*' && p.length() == 1) {
            return false;
        // at the last char in p.
        } else if (pIndex == p.length() - 1) {
            return sIndex == s.length() - 1 && (s.charAt(sIndex) == pc || pc == '.'); // matched the last char in s
        // look for * following this p char.
        } else if (p.charAt(pIndex + 1) == '*') {
            // shift p index to the index after the '*'.
            int newPIndex = pIndex + 2;
            // REMINDER : p = "**" will match s = "*****".  any additional '*' is redundant.
            while (pc == '*' && newPIndex < p.length() && p.charAt(newPIndex) == '*') {
                newPIndex++;
            }
            // shift s index to the index after any valid repetition.
            int repetitions = 0;
            while (sIndex + repetitions <= s.length()) {
                if(isMatch(s, sIndex + repetitions, p, newPIndex)) {
                    return true;
                }
                // REMINDER : '.*' will match any character string.
                if (sIndex + repetitions < s.length() && (s.charAt(sIndex + repetitions) == pc || pc == '.')) {
                    repetitions++;
                } else {
                    // match failed, none of the repetition patterns worked.
                    return false;
                }
            }
        } else if (sIndex >= s.length() || !(s.charAt(sIndex) == pc || pc == '.')) {
            // match failed, character did not match.
            return false;
        }
        // continue checking the remaining characters.
        return isMatch(s, sIndex + 1, p, pIndex +1);
    }
}
