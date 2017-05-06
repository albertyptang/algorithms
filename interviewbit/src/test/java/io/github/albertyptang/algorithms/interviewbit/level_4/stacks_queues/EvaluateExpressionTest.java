package io.github.albertyptang.algorithms.interviewbit.level_4.stacks_queues;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class EvaluateExpressionTest {
    @Test
    public void evalRPN() throws Exception {
        assertEquals(9, EvaluateExpression.evalRPN(new ArrayList<>(Arrays.asList("2", "1", "+", "3", "*"))));
        assertEquals(6, EvaluateExpression.evalRPN(new ArrayList<>(Arrays.asList("4", "13", "5", "/", "+"))));
    }

}