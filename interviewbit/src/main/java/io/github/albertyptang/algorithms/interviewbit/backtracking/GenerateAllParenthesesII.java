package io.github.albertyptang.algorithms.interviewbit.backtracking;

import java.util.ArrayList;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*n.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * Make sure the returned list of strings are sorted.
 *
 * @author atang
 */
public class GenerateAllParenthesesII {

    public static ArrayList<String> generateParenthesis(final int a) {
        final ArrayList<String> results = new ArrayList<>();
        addParens(results, new StringBuilder(), 0, 0, 0, a);
        return results;
    }

    private static void addParens(final ArrayList<String> results, final StringBuilder sb, final int length,
                                  final int numOpen, final int numClosed, final int a) {
        if (length >= a * 2) {
            // reached the end of the string.
            results.add(sb.toString());
            return;
        }
        if (numOpen < a) {
            // add a possible open if the number of open is less than total allowed.
            final StringBuilder sbOpen = new StringBuilder(sb);
            sbOpen.append('(');
            addParens(results, sbOpen, length + 1, numOpen + 1, numClosed, a);
        }
        if (numClosed < numOpen) {
            // add a possible closed if the number of closed is less than current opens.
            final StringBuilder sbClose = new StringBuilder(sb);
            sbClose.append(')');
            addParens(results, sbClose, length + 1, numOpen, numClosed + 1, a);
        }
    }
}
