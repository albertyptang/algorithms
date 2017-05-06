package io.github.albertyptang.algorithms.interviewbit.level_3.binary_search;

/**
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x.
 * <p>
 * If x is not a perfect square, return floor(sqrt(x))
 *
 * @author atang
 */
public class SquareRoot {

    public static int sqrt(final int a) {
        // note: input is not negative.
        // account for overflow with longs
        return (int) sqrt(a, 0, a);
    }

    private static long sqrt(final long a, final long min, final long max) {
        final long median = (max + min) / 2;
        final long square = median * median;
        final long nextSquare = (median + 1) * (median + 1);

        if (square == a || (square < a && nextSquare > a)/* floor */) {
            return median;
        } else if (square > a) {
            return sqrt(a, min, median - 1); // search left.
        } else {
            return sqrt(a, median + 1, max); // search right.
        }
    }
}
