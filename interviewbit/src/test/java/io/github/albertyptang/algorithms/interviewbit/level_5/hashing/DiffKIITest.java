package io.github.albertyptang.algorithms.interviewbit.level_5.hashing;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class DiffKIITest {
    @Test
    public void diffPossible() throws Exception {
        assertEquals(1, DiffKII.diffPossible(Arrays.asList(1, 5, 3), 2));
        assertEquals(1, DiffKII.diffPossible(Arrays.asList(80, 87, 75, 11, 57, 31, 88, 48, 15, 77, 44, 22, 82, 41, 52, 52, 99, 40, 84, 21, 30, 100, 61, 48, 96, 64, 73, 79, 84, 95, 14, 48, 80, 90, 26, 97, 33, 88, 25, 84, 85, 57, 44, 91, 64, 16, 39, 30, 18, 17, 84, 54, 54, 50, 24, 13, 100, 80, 69, 22, 96, 12, 68, 65, 40, 47, 70, 48, 53, 10, 39, 61, 56, 11, 46, 18, 94, 49, 59, 31, 30, 16, 64, 90, 90),
            1)
        );

    }

}