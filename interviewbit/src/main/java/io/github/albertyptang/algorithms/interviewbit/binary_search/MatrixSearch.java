package io.github.albertyptang.algorithms.interviewbit.binary_search;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 *
 * This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than or equal to the last integer of the previous row.
 *
 * Example:
 *
 * Consider the following matrix:
 *
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return 1 ( 1 corresponds to true )
 *
 * Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem
 *
 * @author atang
 */
public class MatrixSearch {
    public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        if (a.size() == 0) {
            return 0;
        }
        final int n = a.get(0).size(); // width
        final int m = a.size(); // length
        // find row first.
        final ArrayList<Integer> firstValues = new ArrayList<>();
        for (final ArrayList<Integer> row : a) {
            firstValues.add(row.get(0));
        }
        // if b exists outside of the matrix.
        if (b < firstValues.get(0) || b > a.get(m - 1).get(n - 1)) {
            return 0;
        }
        final int rowNumber = searchForRow(firstValues, 0, m - 1, b);
        return searchRow(a.get(rowNumber), 0, n - 1, b);
    }

    private static int searchForRow(final ArrayList<Integer> firstValues, final int min, final int max, int b) {
        final int medianIndex = (max + min) / 2;
        final int median = firstValues.get(medianIndex);
        final boolean nextGreater = medianIndex == firstValues.size() - 1 || firstValues.get(medianIndex + 1) > b;
        // return index if the first value is the correct value
        // or if the first value is less than the correct value and the next row's first value is either greater
        // than the correct value or nonexistent.
        if (median == b || (median < b && nextGreater)) {
            return medianIndex;
        } else if (median > b) {
            return searchForRow(firstValues, min, medianIndex - 1, b);
        } else {
            return searchForRow(firstValues, medianIndex + 1, max, b);
        }
    }

    private static int searchRow(final ArrayList<Integer> rowValues, final int min, final int max, int b) {
        if (min > max) {
            return 0;
        }
        final int medianIndex = (max + min) / 2;
        final int median = rowValues.get(medianIndex);
        if (median == b) {
            return 1;
        } else if (median > b) {
            return searchRow(rowValues, min, medianIndex - 1, b);
        } else {
            return searchRow(rowValues, medianIndex + 1, max, b);
        }
    }
}