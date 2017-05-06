package io.github.albertyptang.algorithms.interviewbit.level_5.backtracking;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class GenerateAllParenthesesIITest {
    @Test
    public void generateParenthesis() throws Exception {
        final ArrayList<String> threeResult = GenerateAllParenthesesII.generateParenthesis(3);
        assertEquals("((()))", threeResult.get(0));
        assertEquals("(()())", threeResult.get(1));
        assertEquals("(())()", threeResult.get(2));
        assertEquals("()(())", threeResult.get(3));
        assertEquals("()()()", threeResult.get(4));
    }

}