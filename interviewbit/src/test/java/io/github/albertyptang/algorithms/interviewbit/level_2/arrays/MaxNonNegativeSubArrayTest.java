package io.github.albertyptang.algorithms.interviewbit.level_2.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class MaxNonNegativeSubArrayTest {

    @Test
    public void testMaxset() throws Exception {
        assertEquals("1, 2, 5, -7, 2, 3", new ArrayList<>(Arrays.asList(1, 2, 5)),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 3)))
        );

        assertEquals("1, 2, 5, -7, 2, 3, 22", new ArrayList<>(Arrays.asList(2, 3, 22)),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 3, 22)))
        );

        assertEquals("1967513926, 1540383426, -1303455736, -521595368", new ArrayList<>(Arrays.asList(1967513926, 1540383426)),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368)))
        );
    }

    @Test
    public void testLengthTieBreaker() throws Exception {

        assertEquals("1, 2, 5, -7, 1, 2, 2, 3", new ArrayList<>(Arrays.asList(1, 2, 2, 3)),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(1, 2, 5, -7, 1, 2, 2, 3)))
        );

        assertEquals("1, 2, 1, 4, -7, 1, 2, 5", new ArrayList<>(Arrays.asList(1, 2, 1, 4)),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(1, 2, 1, 4, -7, 1, 2, 5)))
        );
    }

    @Test
    public void testIndexTieBreaker() throws Exception {

        assertEquals("1, 5, 2, -7, 1, 2, 5", new ArrayList<>(Arrays.asList(1, 5, 2)),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(1, 5, 2, -7, 1, 2, 5)))
        );
    }

    @Test
    public void testCornerCases() throws Exception {

        assertEquals("", new ArrayList<>(),
            MaxNonNegativeSubArray.maxset(new ArrayList<>())
        );

        assertEquals("-2, -3, -4", new ArrayList<>(),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(-2, -3, -4)))
        );

        assertEquals("-2, -3, 2, -4", new ArrayList<>(Collections.singletonList(2)),
            MaxNonNegativeSubArray.maxset(new ArrayList<>(Arrays.asList(-2, -3, 2, -4)))
        );
    }
}