package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p>
 * Examples:
 * <p>
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 * @author atang
 */
public class EvaluateExpression {

    private static final Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

    public static int evalRPN(final ArrayList<String> a) {
        final Stack<String> stack = new Stack<>();
        for (final String string : a) {
            if (operators.contains(string)) {
                final int numTwo = Integer.valueOf(stack.pop());
                final int numOne = Integer.valueOf(stack.pop());
                int innerResult = 0;
                switch (string) {
                    case "+":
                        innerResult = numOne + numTwo;
                        break;
                    case "-":
                        innerResult = numOne - numTwo;
                        break;
                    case "*":
                        innerResult = numOne * numTwo;
                        break;

                    case "/":
                        innerResult = numOne / numTwo;
                        break;
                    default:
                        break;
                }
                stack.push(String.valueOf(innerResult));
            } else {
                stack.push(string);
            }
        }
        return Integer.valueOf(stack.peek());
    }
}