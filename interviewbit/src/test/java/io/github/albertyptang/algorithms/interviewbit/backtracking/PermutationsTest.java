package io.github.albertyptang.algorithms.interviewbit.backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class PermutationsTest {
    @Test
    public void permute() throws Exception {
        assertEquals(120, Permutations.permute(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))).size());
        assertEquals(24, Permutations.permute(new ArrayList<>(Arrays.asList(1, 2, 3, 4))).size());
        assertEquals(6, Permutations.permute(new ArrayList<>(Arrays.asList(1, 2, 3))).size());
        assertEquals(2, Permutations.permute(new ArrayList<>(Arrays.asList(1, 2))).size());
    }
}