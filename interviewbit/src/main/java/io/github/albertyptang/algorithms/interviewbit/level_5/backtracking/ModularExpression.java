package io.github.albertyptang.algorithms.interviewbit.level_5.backtracking;

/**
 * Implement pow(A, B) % C.
 * <p>
 * In other words, given A, B and C,
 * find (AB)%C.
 * <p>
 * Input : A = 2, B = 3, C = 3
 * Return : 2
 * 2^3 % 3 = 8 % 3 = 2
 *
 * @author atang
 * @see io.github.albertyptang.algorithms.interviewbit.level_3.binary_search.PowerFunction
 */
public class ModularExpression {

    // (x * x) % d = ((x % d) * (x % d)) % d
    // (x * x * x) % d = ((x % d) * (x * x) % d) % d
    public static int Mod(int a, int b, int c) {
        if (b == 0) {
            return 1 % c;
        }
        long result;
        if (b % 2 == 0) {
            final int mod = Mod(a, b / 2, c);
            // cast to long to prevent int overflow.
            result = ((long) mod * mod) % c;
        } else {
            result = ((long) (a % c) * Mod(a, b - 1, c)) % c;
        }
        return (int) ((result + c) % c);
    }
}
