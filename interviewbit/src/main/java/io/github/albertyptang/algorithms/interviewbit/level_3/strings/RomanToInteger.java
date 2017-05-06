package io.github.albertyptang.algorithms.interviewbit.level_3.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Read more details about roman numerals at Roman Numeric System
 * <p>
 * Example :
 * <p>
 * Input : "XIV"
 * Return : 14
 * Input : "XX"
 * Output : 20
 *
 * @author atang
 */
public class RomanToInteger {

    private static final Map<Character, Integer> charToInt = new HashMap<>();
    private static final Map<Character, Character> charToReducer = new HashMap<>();

    static {
        charToInt.put('I', 1);
        charToInt.put('V', 5);
        charToInt.put('X', 10);
        charToInt.put('L', 50);
        charToInt.put('C', 100);
        charToInt.put('D', 500);
        charToInt.put('M', 1000);
    }

    static {
        charToReducer.put('V', 'I');
        charToReducer.put('X', 'I');
        charToReducer.put('L', 'X');
        charToReducer.put('C', 'X');
        charToReducer.put('D', 'C');
        charToReducer.put('M', 'C');
    }

    public static int romanToInt(String a) {
        int value = 0;
        for (int i = 0; i < a.length(); i++) {
            final char c = a.charAt(i);
            final int charValue = charToInt.get(c);
            if (i + 1 < a.length() && c == charToReducer.getOrDefault(a.charAt(i + 1), '?')) {
                value -= charValue;
            } else {
                value += charValue;
            }
        }
        return value;
    }
}