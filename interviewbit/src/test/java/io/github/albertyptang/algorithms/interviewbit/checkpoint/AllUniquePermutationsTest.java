package io.github.albertyptang.algorithms.interviewbit.checkpoint;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class AllUniquePermutationsTest {
    @Test
    public void permute() throws Exception {
        assertEquals(3, AllUniquePermutations.permute(new ArrayList<>(Arrays.asList(1, 1, 2))).size());
    }
}
