package io.github.albertyptang.algorithms.interviewbit.level_5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class AllUniquePermutationsTest {
    @Test
    public void permute() throws Exception {
        assertEquals(3, AllUniquePermutations.permute(new ArrayList<>(Arrays.asList(1, 1, 2))).size());
    }
}
