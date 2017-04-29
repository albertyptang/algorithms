package io.github.albertyptang.algorithms.interviewbit.checkpoint;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class KthSmallestElementTest {
    @Test
    public void kthsmallest() throws Exception {
        assertEquals(2, KthSmallestElement.kthsmallest(
            new ArrayList<>(Arrays.asList(2, 1, 4, 3, 2)),
            3)
        );
        assertEquals(87, KthSmallestElement.kthsmallest(
            new ArrayList<>(Arrays.asList(94, 87, 100, 11, 23, 98, 17, 35, 43, 66, 34, 53, 72, 80, 5, 34, 64, 71, 9, 16, 41, 66, 96)),
            19)
        );
        assertEquals(17, KthSmallestElement.kthsmallest(
            new ArrayList<>(Arrays.asList(8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92)),
            9)
        );
    }

}