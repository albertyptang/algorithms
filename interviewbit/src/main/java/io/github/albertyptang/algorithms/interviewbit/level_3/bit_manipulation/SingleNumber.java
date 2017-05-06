package io.github.albertyptang.algorithms.interviewbit.level_3.bit_manipulation;

import java.util.List;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example :
 * <p>
 * Input : [1 2 2 3 1]
 * Output : 3
 *
 * @author atang
 */
public class SingleNumber {
    // DO NOT MODIFY THE LIST
    public static int singleNumber(final List<Integer> a) {
        int xor = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            xor ^= a.get(i);
        }
        return xor;
    }
}
