package io.github.albertyptang.algorithms.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author atang
 */
public class EasySolutionTest {
    @Test
    public void twoSum() throws Exception {
        final int[] input = new int[]{2, 7, 11, 15};
        final int target = 9;

        final int[] solution = new EasySolution().twoSum(input, target);
        Assert.assertArrayEquals(solution, new int[] {0,1});
    }
}
