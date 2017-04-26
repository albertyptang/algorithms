package io.github.albertyptang.algorithms.interviewbit.strings;

/**
 * Given an input string, reverse the string word by word.
 *
 * Example:
 *
 * Given s = "the sky is blue",
 *
 * return "blue is sky the".
 *
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 *
 * * @author atang
 */
public class ReverseString {

    public static String reverseWords(final String a) {
        final StringBuilder reversedString = new StringBuilder();
        boolean firstWord = true;
        final String[] splitString = a.split(" ");
        for (int i = splitString.length - 1; i >= 0; i --) {
            if (!splitString[i].isEmpty()) {
                if (firstWord) {
                    firstWord = false;
                } else {
                    reversedString.append(' ');
                }
                reversedString.append(splitString[i]);
            }
        }
        return reversedString.toString();
    }
}
