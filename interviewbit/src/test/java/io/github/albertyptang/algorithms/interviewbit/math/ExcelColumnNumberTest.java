package io.github.albertyptang.algorithms.interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class ExcelColumnNumberTest {
    @Test
    public void titleToNumber() throws Exception {
        assertEquals(1, ExcelColumnNumber.titleToNumber("A"));
        assertEquals(26, ExcelColumnNumber.titleToNumber("Z"));
        assertEquals(27, ExcelColumnNumber.titleToNumber("AA"));
        assertEquals(702, ExcelColumnNumber.titleToNumber("ZZ"));
        assertEquals(703, ExcelColumnNumber.titleToNumber("AAA"));
    }
}