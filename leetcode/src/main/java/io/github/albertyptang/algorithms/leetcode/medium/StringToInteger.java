package io.github.albertyptang.algorithms.leetcode.medium;

/**
 * 8. String to Integer (atoi)
 *
 * Implement atoi to convert a string to an integer.
 *
 * @author atang
 */
public class StringToInteger {

    /**
     * from http://www.cplusplus.com/reference/cstdlib/atoi/
     *
     * The function first discards as many whitespace characters (as in isspace) as necessary until the first
     * non-whitespace character is found. Then, starting from this character, takes an optional initial plus or
     * minus sign followed by as many base-10 digits as possible, and interprets them as a numerical value.
     *
     * The string can contain additional characters after those that form the integral number, which are ignored and
     * have no effect on the behavior of this function.
     *
     * If the first sequence of non-whitespace characters in str is not a valid integral number,
     * or if no such sequence exists because either str is empty or it contains only whitespace characters,
     * no conversion is performed and zero is returned.
     */
    public static int atoi(final String str) {
        int result = 0; // return 0 for failed conversions.
        boolean negative = false;
        boolean started = false;
        for (int i = 0; i < str.length(); i++) {
            final char c = str.charAt(i);
            if (!started && Character.isWhitespace(c)) {
                // if the beginning hasn't been found yet, discard whitespace.
                continue;
            } else if (!started){
                started = true;
                // handle optional sign at start.
                if (c == '-' || c == '+') {
                    negative = c == '-';
                    continue;
                }
            }
            if (Character.isDigit(c)) {
                // handle base-10 digits.
                final int potentialResult = result * 10 + Character.getNumericValue(c);
                // NOTE : "2147483648" will overflow to -2147483648.
                //        because "-2147483648" is acceptable, account for this case.
                if(potentialResult == Integer.MIN_VALUE && negative) {
                    return Integer.MIN_VALUE;
                } else if (potentialResult/10 != result) {
                // NOTE : handle overflow edge cases the same inaccurate way atoi does.
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else {
                    result = potentialResult;
                }
            } else {
                break; // if you come across a non-digit, return whatever number you have.
            }
        }
        return result * (negative ? -1 : 1);
    }
}
