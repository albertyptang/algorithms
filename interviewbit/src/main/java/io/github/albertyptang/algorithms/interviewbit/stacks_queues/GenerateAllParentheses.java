package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * <p>
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 *
 * @author atang
 */
public class GenerateAllParentheses {
    public static int isValid(final String a) {

        final Map<Character, Character> closedToOpenParens = new HashMap<>();
        closedToOpenParens.put(')', '(');
        closedToOpenParens.put(']', '[');
        closedToOpenParens.put('}', '{');

        final Set<Character> openParensSet = new HashSet<>(Arrays.asList('(', '{', '['));

        final Stack<Character> openParens = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            final char c = a.charAt(i);
            if (closedToOpenParens.keySet().contains(c)) {
                if (openParens.size() < 1 || closedToOpenParens.get(c) != openParens.pop()) {
                    return 0;
                }
            } else if (openParensSet.contains(c)) {
                openParens.push(c);
            }
        }
        return openParens.size() == 0 ? 1 : 0;
    }
}
