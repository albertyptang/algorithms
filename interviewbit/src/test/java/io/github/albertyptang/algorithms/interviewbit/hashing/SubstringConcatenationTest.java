package io.github.albertyptang.algorithms.interviewbit.hashing;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class SubstringConcatenationTest {

    @Test
    public void findSubstring() throws Exception {
        final ArrayList<Integer> a = SubstringConcatenation.findSubstring(
            "barfoothefoobarman",
            new ArrayList<>(Arrays.asList("foo", "bar"))
        );
        assertArrayEquals(new Integer[]{0, 9}, a.toArray(new Integer[a.size()]));

        final ArrayList<Integer> b = SubstringConcatenation.findSubstring(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            new ArrayList<>(Arrays.asList("aaa", "aaa", "aaa", "aaa", "aaa"))
        );
        assertArrayEquals(
            new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98},
            b.toArray(new Integer[b.size()])
        );
    }

}
