package io.github.albertyptang.algorithms.interviewbit.level_3.binary_search;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement pow(x, n) % d.
 * <p>
 * In other words, given x, n and d,
 * <p>
 * find (x^n % d)
 * <p>
 * Note that remainders on division cannot be negative.
 * In other words, make sure the answer you return is non negative.
 * <p>
 * Input : x = 2, n = 3, d = 3
 * Output : 2
 * <p>
 * 2^3 % 3 = 8 % 3 = 2.
 *
 * @author atang
 */
public class PowerFunction {

    // note: this is a modular exponentiation question
    // explanation:
    // 1. (x^a)^2 = x^(2a)
    // 2. x^(a+b) = x^a * x^b
    // 3. (x * x) % d = ((x % d)*(x % d)) % d
    // thus
    // 3^200 % 50 = (3^128 % 50) * (3^64 % 50) * (3^8 % 50)
    //            = ((3^64 % 50)^2) % 50 * (3^64 % 50) * (3^8 % 50)

    public static int pow(int x, int n, int d) {
        final Map<Long, Long> exponentToMod = new HashMap<>();
        exponentToMod.put(1L, (long) (x % d));
        long powerOfTwo = 2;
        while (powerOfTwo <= n) {
            final long previousMod = exponentToMod.get(powerOfTwo / 2);
            exponentToMod.put(powerOfTwo, (previousMod * previousMod) % d);
            powerOfTwo *= 2;
        }
        final String binaryString = Integer.toBinaryString(n);
        long result = 1;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                final int binaryDigit = binaryString.length() - 1 - i;
                final long powerOfTwoLookup = (int) (Math.pow(2, binaryDigit));
                result *= exponentToMod.get(powerOfTwoLookup);
                result %= d; // prevent overflow by performing mod regularly on the result.
            }
        }
        return (int) (result < 0 ? result + d : result % d);
    }
}
