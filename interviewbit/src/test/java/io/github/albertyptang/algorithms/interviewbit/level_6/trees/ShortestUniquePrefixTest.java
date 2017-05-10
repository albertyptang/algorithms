package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class ShortestUniquePrefixTest {
    @Test
    public void prefix() throws Exception {
        assertEquals(new ArrayList<>(
                Arrays.asList("z", "dog", "du", "dov")),
            ShortestUniquePrefix.prefix(new ArrayList<>(Arrays.asList("zebra", "dog", "duck", "dove")))
        );

        assertEquals(new ArrayList<>(
                Arrays.asList("bea", "ber")),
            ShortestUniquePrefix.prefix(new ArrayList<>(Arrays.asList("bearcat", "bert")))
        );
    }
}