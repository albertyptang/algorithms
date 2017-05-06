package io.github.albertyptang.algorithms.interviewbit.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array A of integers, find the index of values that satisfy A + B = C + D, where A,B,C & D are integer values in the array
 * <p>
 * Note:
 * <p>
 * 1) Return the indices `A1 B1 C1 D1`, so that
 * A[A1] + A[B1] = A[C1] + A[D1]
 * A1 < B1, C1 < D1
 * A1 < C1, B1 != D1, B1 != C1
 * <p>
 * 2) If there are more than one solutions,
 * then return the tuple of values which are lexicographical smallest.
 * <p>
 * Assume we have two solutions
 * S1 : A1 B1 C1 D1 ( these are values of indices int the array )
 * S2 : A2 B2 C2 D2
 * <p>
 * S1 is lexicographically smaller than S2 iff
 * A1 < A2 OR
 * A1 = A2 AND B1 < B2 OR
 * A1 = A2 AND B1 = B2 AND C1 < C2 OR
 * A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 < D2
 * Example:
 * <p>
 * Input: [3, 4, 7, 1, 2, 9, 8]
 * Output: [0, 2, 3, 5] (O index)
 * If no solution is possible, return an empty list.
 *
 * @author atang
 */
public class Equal {

    private static class Tuple {
        public int first;
        public int second;

        public Tuple(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static ArrayList<Integer> equal(final ArrayList<Integer> a) {

        ArrayList<Integer> result = new ArrayList<>();

        // A[A1] + A[B1] = A[C1] + A[D1]
        final Map<Integer, Tuple> sumToTuple = new HashMap<>();

        // A1 < B1, C1 < D1
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                final int sum = a.get(i) + a.get(j);
                if (sumToTuple.containsKey(sum)) {
                    final Tuple ab = sumToTuple.get(sum);

                    // A1 < C1, B1 != D1, B1 != C1
                    if (ab.first < i && ab.second != j && ab.second != i) {
                        final ArrayList<Integer> possibleResult = new ArrayList<>(Arrays.asList(ab.first, ab.second, i, j));

                        // lexicographical comparison
                        boolean possibleIsLess = true;
                        for (int k = 0; k < result.size(); k++) {
                            if (!possibleResult.get(k).equals(result.get(k))) {
                                possibleIsLess = possibleResult.get(k) - result.get(k) < 0;
                                break;
                            }
                        }
                        result = possibleIsLess ? possibleResult : result;
                    }
                } else {
                    sumToTuple.put(sum, new Tuple(i, j));
                }
            }
        }
        return result;
    }
}
