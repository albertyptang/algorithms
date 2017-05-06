package io.github.albertyptang.algorithms.interviewbit.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * <p>
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
 * <p>
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * <p>
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * There might be multiple gray code sequences possible for a given n.
 * Return any such sequence.
 *
 * @author atang
 */
public class GrayCode {

    public static ArrayList<Integer> grayCode(final int a) {

        final int[] resultArr = new int[1 << a];
        for (int i = 0; i < a; i++) {
            int index = 1 << i;
            int repetitions = 1 << (i + 1);
            int count = repetitions;
            while (index < resultArr.length) {
                resultArr[index] |= 1 << i;
                index++;
                count--;
                if (count == 0) {
                    count = repetitions;
                    index+= repetitions;
                }
            }
        }

        final ArrayList<Integer> result = new ArrayList<>();
        for (int n : resultArr) {
            result.add(n);
        }
        return result;
    }
}
