package io.github.albertyptang.algorithms.interviewbit.math;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 *
 * A -> 1
 *
 * B -> 2
 *
 * C -> 3
 *
 * ...
 *
 * Z -> 26
 *
 * AA -> 27
 *
 * AB -> 28
 *
 * @author atang
 */
public class ExcelColumnNumber {
    // note: 'A' = 65

    public static int titleToNumber(final String a) {
        int finalNumber = 0;
        int digit = 0;
        for (int i = a.length() - 1; i >= 0 ; i--) {
            final int number = a.charAt(i) - 64;
            finalNumber += number * Math.pow(26,digit);
            digit++;
        }
        return finalNumber;
    }
}
