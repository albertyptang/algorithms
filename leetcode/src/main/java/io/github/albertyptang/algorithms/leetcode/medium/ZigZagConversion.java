package io.github.albertyptang.algorithms.leetcode.medium;

/**
 * 6. ZigZag Conversion
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 * @author atang
 */
public class ZigZagConversion {

    public static String convert(final String s, final int numRows) {
        // figure out zigzag pattern.
        // numRows = 1
        //  0 1 2
        // numRows = 2
        //  0 2 4
        //  1 3
        // numRows = 3
        //  0   4   8       gap = 4
        //  1 3 5 7         gap = 2, 2
        //  2   6           gap = 4
        // numRows = 4
        //  0     6    12   gap = 6
        //  1   5 7   11    gap = 4, 2
        //  2 4   8 10      gap = 2, 4
        //  3     9         gap = 6
        // the next column starts at index numRows * 2 - 2
        if (numRows < 2) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        final int gap = numRows * 2 - 2; // NOTE : numRows of 1 would cause gap to be 0 instead of 1
        int row = 0;
        while (row < numRows) { // iterate through rows
            for (int i = row; i < s.length(); i += gap) { // iterate through text
                sb.append(s.charAt(i));
                // mid gap is the space between the column letter and the middle letter in the zig zag.
                final int midGap = gap - 2 * row;
                if (midGap > 0 && midGap < gap && i + midGap < s.length()/*upper bound*/) {
                    sb.append(s.charAt(i + midGap));
                }
            }
            row++;
        }
        return sb.toString();
    }
}
