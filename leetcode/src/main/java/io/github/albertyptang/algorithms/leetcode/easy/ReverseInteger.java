package io.github.albertyptang.algorithms.leetcode.easy;

/**
 * 7. Reverse Integer
 *
 * Reverse digits of an integer.
 *
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 *
 * @author atang
 */
public class ReverseInteger {

    public static int reverse(final int x) {
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }
        final boolean negative = x < 0;
        int oldNum = negative ? ~x + 1 : x;
        int newNum = 0;
        while (oldNum != 0) {
            // grab the last digit of oldNum.
            final int digit = oldNum % 10;
            // "shift" newNum to the left to add the new digit to the end.
            // check for potential overflow
            if ((newNum * 10 + digit)/10 != newNum) {
                return 0;
            } else {
                newNum = newNum * 10 + digit;
            }
            // "shift" oldNum to the right to grab the next digit, breaking the loop if there is no digit to grab.
            oldNum = oldNum / 10;

        }
        // min/max integer cannot be reversed so the two's complement won't affect result.
        return newNum * (negative ? -1 : 1);
    }
}