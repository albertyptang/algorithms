package io.github.albertyptang.algorithms.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author atang
 */
public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        final int[] input = new int[]{2, 7, 11, 15};
        final int target = 9;

        final int[] solution = new TwoSum().twoSum(input, target);
        Assert.assertArrayEquals(new int[] {0,1}, solution);
    }
}
