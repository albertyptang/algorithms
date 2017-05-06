package io.github.albertyptang.algorithms.interviewbit.hashing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class PointsOnStraightLineTest {
    @Test
    public void testMaxPoints() throws Exception {

        // slope = -0
        assertEquals(3, PointsOnStraightLine.maxPoints(
            new ArrayList<>(Arrays.asList(4, 8, -4)),
            new ArrayList<>(Arrays.asList(-4, -4, -4)))
        );

        // slope = infinity
        assertEquals(3, PointsOnStraightLine.maxPoints(
            new ArrayList<>(Arrays.asList(1, 1, 1)),
            new ArrayList<>(Arrays.asList(0, 4, -1)))
        );

        // slope = 1
        assertEquals(4, PointsOnStraightLine.maxPoints(
            new ArrayList<>(Arrays.asList(0, 1, 2, -1)),
            new ArrayList<>(Arrays.asList(0, 1, 2, -1)))
        );

        // slope = .33333
        assertEquals(4, PointsOnStraightLine.maxPoints(
            new ArrayList<>(Arrays.asList(0, 3, 6, 12)),
            new ArrayList<>(Arrays.asList(0, 1, 2, 4)))
        );

        // slope = none
        assertEquals(1, PointsOnStraightLine.maxPoints(
            new ArrayList<>(Collections.singletonList(-20)),
            new ArrayList<>(Collections.singletonList(-13)))
        );

        // slope = strange double values.
        final List<Integer> list = Arrays.asList(18, -3, 15, 14, -10, -9, 15, 18, -11, 14, 4, 17, 13, -18, -7, 1, 5, -18, -4, -18, 3, 18, -12, 3, 20, -16, -18, 12, 19, -2, -4, -15, -13, -2, -11, 20, 10, -14, 1, 19, -8, 10);
        final ArrayList<Integer> xList = new ArrayList<>();
        final ArrayList<Integer> yList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                xList.add(list.get(i));
            } else {
                yList.add(list.get(i));
            }
        }
        assertEquals(4, PointsOnStraightLine.maxPoints(xList, yList));

        // duplicate points
        final List<Integer> list2 = Arrays.asList(14, -2, -17, -3, 2, 3, -13, -5, -18, 6, 9, -10, 15, 5, 2, 11, -3, 18, -7, -1, -10, -13, 14, -6, -2, 13, -18, -14, -7, -1, 12, -19, 1, -13, -9, 2, -16, -6, -4, -3, 11, 2, -4, -2, -16, -11, 17, 5, 5, -13, 8, 18, -16, -15, -8, 12, 5, 5, 4, 14, 16, 2, 14, 8, -12, 4, 13, -20, 2, -1, -14, -1, -9, -16, 20, 20, -5, -9, -19, -2, -16, 0, -19, 1, 3, -4, 3, -1, 1, -20, -18, -2, 19, -9, 11, 2, -16, 10, 10, -12, 12, 4, -5, 12, -1, -3, -5, 2, -17, 3, -20, 4, 18, -1, -15, 10, -3, 19, -5, -17, 17, 14, 14, 7, 0, 17, 0, 5, 3, -9, 10, -13, 13, 6, 10, 18, 15, 1, 2, 2, 19, 4, -14, 6, -17, 6, 4, -3, 6, 7, 1, 18, 12, 18);
        final ArrayList<Integer> xList2 = new ArrayList<>();
        final ArrayList<Integer> yList2 = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {
            if (i % 2 == 0) {
                xList2.add(list2.get(i));
            } else {
                yList2.add(list2.get(i));
            }
        }
        assertEquals(7, PointsOnStraightLine.maxPoints(xList2, yList2));
    }
}