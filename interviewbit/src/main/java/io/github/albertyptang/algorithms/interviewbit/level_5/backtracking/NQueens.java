package io.github.albertyptang.algorithms.interviewbit.level_5.backtracking;

import java.util.ArrayList;

/**
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 * <p>
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * <p>
 * Each solution contains a distinct board configuration of the n-queens’ placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 * <p>
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 * <p>
 * [
 * [".Q..",  // Solution 1
 * "...Q",
 * "Q...",
 * "..Q."],
 * <p>
 * ["..Q.",  // Solution 2
 * "Q...",
 * "...Q",
 * ".Q.."]
 * ]
 *
 * @author atang
 */
public class NQueens {

    public static ArrayList<ArrayList<String>> solveNQueens(final int a) {
        final ArrayList<ArrayList<String>> results = new ArrayList<>();

        final ArrayList<char[]> result = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            result.add(new char[a]);
        }

        solveNQueensRecursion(a, result, results, 0);
        return results;
    }

    private static void solveNQueensRecursion(final int a, final ArrayList<char[]> result,
                                              final ArrayList<ArrayList<String>> results, final int rowIndex) {
        if (rowIndex < a) {
            final char[] row = result.get(rowIndex);
            for (int i = 0; i < row.length; i++) {
                if (row[i] != '.') {
                    final ArrayList<char[]> clonedResult = new ArrayList<>();
                    for (final char[] charArr : result) {
                        clonedResult.add(charArr.clone());
                    }
                    clonedResult.get(rowIndex)[i] = 'Q';
                    eliminateCoordinates(clonedResult, rowIndex, i);
                    solveNQueensRecursion(a, clonedResult, results, rowIndex + 1);
                }
            }

        } else {
            final ArrayList<String> finalResult = new ArrayList<>();
            for (final char[] charArr : result) {
                finalResult.add(String.valueOf(charArr));
            }
            results.add(finalResult);
        }
    }

    private static void eliminateCoordinates(final ArrayList<char[]> result, final int rowIndex, final int columnIndex) {
        final char[] row = result.get(rowIndex);
        for (int i = 0; i < row.length; i++) {
            // wipe out row.
            if (row[i] != 'Q' && row[i] != '.') {
                row[i] = '.';
            }
            // wipe out column.
            final char columnCoordinate = result.get(i)[columnIndex];
            if (columnCoordinate != 'Q' && columnCoordinate != '.') {
                result.get(i)[columnIndex] = '.';
            }
            // wipe out diagonal \.
            final int forwardDiagonalRow = rowIndex - (columnIndex - i);
            if (forwardDiagonalRow >= 0 && forwardDiagonalRow < row.length) {
                final char forwardDiagonalCoordinate = result.get(forwardDiagonalRow)[i];
                if (forwardDiagonalCoordinate != 'Q' && forwardDiagonalCoordinate != '.') {
                    result.get(forwardDiagonalRow)[i] = '.';
                }
            }
            // wipe out diagonal /.
            final int backDiagonalRow = rowIndex + (columnIndex - i);
            if (backDiagonalRow >= 0 && backDiagonalRow < row.length) {
                final char backDiagonalCoordinate = result.get(backDiagonalRow)[i];
                if (backDiagonalCoordinate != 'Q' && backDiagonalCoordinate != '.') {
                    result.get(backDiagonalRow)[i] = '.';
                }
            }
        }
    }
}
