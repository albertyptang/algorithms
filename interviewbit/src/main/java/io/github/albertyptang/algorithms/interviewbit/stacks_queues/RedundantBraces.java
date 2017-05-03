package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import java.util.Stack;

/**
 * Write a program to validate if the input string has redundant braces?
 * Return 0/1
 * 0 -> NO 1 -> YES
 * <p>
 * Input will be always a valid expression
 * <p>
 * and operators allowed are only + , * , - , /
 * <p>
 * Example:
 * <p>
 * ((a + b)) has redundant braces so answer will be 1
 * (a + (a + b)) doesn't have have any redundant braces so answer will be 0
 *
 * @author atang
 */
public class RedundantBraces {

    public static int braces(final String a) {
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            final char c = a.charAt(i);
            if (c == '(') {
                stack.push('(');
                if (i > 0 && a.charAt(i - 1) == '(') {
                    stack.push('*'); // double marker
                }
            } else if (c == ')') {
                final char popped = stack.pop();
                if (popped == '*') {
                    // account for ((a + b))
                    if (i + 1 < a.length() && a.charAt(i + 1) == ')') {
                        return 1;
                    } else {
                        stack.pop();
                    }
                } else if (i > 1 && a.charAt(i - 2) == '(') {
                    // account for (a)
                    return 1;
                }
            }
        }
        return 0;
    }
}
