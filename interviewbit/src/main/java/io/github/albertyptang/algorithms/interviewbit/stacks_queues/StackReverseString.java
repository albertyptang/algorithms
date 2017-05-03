package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a string S, reverse the string using stack.
 * <p>
 * Example :
 * <p>
 * Input : "abc"
 * Return "cba"
 *
 * @author atang
 */
public class StackReverseString {

    public static String reverseString(String a) {
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));
        }
        final StringBuilder sb = new StringBuilder();
        while (stack.size() > 0) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}