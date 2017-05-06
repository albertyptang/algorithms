package io.github.albertyptang.algorithms.interviewbit.level_2.math;

/**
 * Given 2 non negative integers m and n, find gcd(m, n)
 * <p>
 * GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
 * Both m and n fit in a 32 bit signed integer.
 * <p>
 * Example
 * <p>
 * m : 6
 * n : 9
 * <p>
 * GCD(m, n) : 3
 * <p>
 * NOTE : DO NOT USE LIBRARY FUNCTIONS
 *
 * @author atang
 */
public class GreatestCommonDivisor {

    public static int gcd(final int a, final int b) {
        final int greater = a >= b ? a : b;
        final int lesser = greater == a ? b : a;
        for (int i = 1; i <= lesser; i++) {
            if (lesser % i == 0 && greater % (lesser / i) == 0) {
                return lesser / i;
            }
        }
        return lesser == 0 ? greater : 1;
    }
}
