package io.github.albertyptang.algorithms.interviewbit.level_3.bit_manipulation;

/**
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.
 * <p>
 * Example:
 * <p>
 * The 32-bit integer 11 has binary representation
 * <p>
 * 00000000000000000000000000001011
 * so the function should return 3.
 * <p>
 * Note that since Java does not have unsigned int, use long for Java
 *
 * @author atang
 */
public class NumberOf1Bits {

    public static int numSetBits(final long a) {
        int count = 0;
        long num = a;
        while (num > 0) {
            if (num % 2 != 0) {
                count++;
            }
            num /= 2;
        }
        return count;
    }
}
