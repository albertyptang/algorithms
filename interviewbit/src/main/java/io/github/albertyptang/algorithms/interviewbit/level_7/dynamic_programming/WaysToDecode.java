package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * <p>
 * Example :
 * <p>
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * <p>
 * The number of ways decoding "12" is 2.
 *
 * @author atang
 */
public class WaysToDecode {

    public static int numDecodings(String a) {
        // solutions of substrings from start index to end.
        final Map<Integer,Integer> startToSolution = new HashMap<>();
        final char lastChar = a.charAt(a.length() - 1);
        int lastCharSolutions = lastChar == '0' ? 0 : 1;
        startToSolution.put(a.length() - 1, lastCharSolutions); // add solution of last char.
        startToSolution.put(a.length(), 1); // 1 solution for blank.

        for (int i = a.length() - 2; i >= 0; i--) {
            int solutions = 0;
            final int n = a.charAt(i);
            if (n != '0') {
                // add all solutions of following substring.
                solutions += startToSolution.get(i + 1);
            }

            final int following = Character.getNumericValue(a.charAt(i + 1));
            if (n == '1' || (n == '2' && following <= 6)) { // potential double digit number
                // add solutions assuming the following number is part of this letter.
                solutions += startToSolution.get(i + 2);
            }
            startToSolution.put(i, solutions);
        }
        return startToSolution.get(0);
    }
}
