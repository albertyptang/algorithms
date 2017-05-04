package io.github.albertyptang.algorithms.interviewbit.backtracking;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class ModularExpressionTest {
    @Test
    public void mod() throws Exception {
//        assertEquals(19, ModularExpression.Mod(-1, 1, 20));
        assertEquals(9039425, ModularExpression.Mod(90752123, 47261846, 38742364));
    }
}