package io.github.albertyptang.algorithms.interviewbit.level_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class NextGreaterTest {
    @Test
    public void nextGreater() throws Exception {
        assertEquals(new ArrayList<>(Arrays.asList(5, 10, 10, -1)), NextGreater.nextGreater(new ArrayList<>(Arrays.asList(4, 5, 2, 10))));
        assertEquals(new ArrayList<>(Arrays.asList(-1, -1, -1)), NextGreater.nextGreater(new ArrayList<>(Arrays.asList(3, 2, 1))));
        assertEquals(new ArrayList<>(Arrays.asList(35, 42, 42, -1, 28, 39, -1, 28, -1)),
            NextGreater.nextGreater(new ArrayList<>(Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28)))
        );
        assertEquals(new ArrayList<>(Arrays.asList(49, 42, 49, 49, 49, 49, -1, -1)),
            NextGreater.nextGreater(new ArrayList<>(Arrays.asList(48, 38, 42, 39, 28, 6, 49, 34)))
        );
    }
}