package io.github.albertyptang.algorithms.interviewbit.level_2.math;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * <p>
 * A -> 1
 * <p>
 * B -> 2
 * <p>
 * C -> 3
 * <p>
 * ...
 * <p>
 * Z -> 26
 * <p>
 * AA -> 27
 * <p>
 * AB -> 28
 *
 * @author atang
 */
public class ExcelColumnNumber {
    // note: 'A' = 65

    public static int titleToNumber(final String a) {
        int finalNumber = 0;
        int digit = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            final int number = a.charAt(i) - 64;
            finalNumber += number * Math.pow(26, digit);
            digit++;
        }
        return finalNumber;
    }
}
