package io.github.albertyptang.algorithms.interviewbit.bit_manipulation;

import java.util.List;

/**
 * Given an array of integers, every element appears thrice except for one which occurs once.
 *
 * Find that element which does not appear thrice.
 *
 * Note: Your algorithm should have a linear runtime complexity.
 *
 * Could you implement it without using extra memory?
 *
 * Example :
 *
 * Input : [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
 * Output : 4
 * @author atang
 */
public class SingleNumberII {
    // DO NOT MODIFY THE LIST
    public static int singleNumber(final List<Integer> a) {
        int singleNumber = 0;
        int digit = 1;
        while (digit <= 32) {
            int count = 0;
            for (final int i : a) {
                if ((i & 1 << (digit - 1)) > 0) { // has 1 at bit position.
                    count++;
                }
            }
            if (count % 3 != 0) {
                // if there isn't a multiple of 3 bits, the extra bit comes from the single number.
                singleNumber |= 1 << (digit - 1);
            }
            digit++;
        }
        return singleNumber;
    }
}
