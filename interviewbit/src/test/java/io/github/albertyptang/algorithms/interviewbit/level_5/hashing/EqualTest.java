package io.github.albertyptang.algorithms.interviewbit.level_5.hashing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class EqualTest {
    @Test
    public void equal() throws Exception {
        assertEquals(new ArrayList<>(Arrays.asList(0, 2, 3, 5)), Equal.equal(new ArrayList<>(Arrays.asList(3, 4, 7, 1, 2, 9, 8))));
        assertEquals(new ArrayList<>(), Equal.equal(new ArrayList<>(Arrays.asList(1, 2, 3))));
        assertEquals(new ArrayList<>(Arrays.asList(0, 1, 2, 3)), Equal.equal(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1))));
    }

}