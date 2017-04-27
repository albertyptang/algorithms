package io.github.albertyptang.algorithms.interviewbit.bit_manipulation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        assertEquals(2, SingleNumber.singleNumber(new ArrayList<>(Arrays.asList(1,2,1))));
        assertEquals(2, SingleNumber.singleNumber(new ArrayList<>(Collections.singletonList(2))));
    }
}