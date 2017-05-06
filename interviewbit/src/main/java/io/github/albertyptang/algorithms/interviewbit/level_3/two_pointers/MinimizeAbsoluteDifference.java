package io.github.albertyptang.algorithms.interviewbit.level_3.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given three sorted arrays A, B and C of not necessarily same sizes.
 * <p>
 * Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c
 * such that a, b, c belongs in arrays A, B, C respectively.
 * i.e. minimize | maxRef(a,b,c) - minRef(a,b,c) |.
 * <p>
 * Example :
 * <p>
 * Input:
 * <p>
 * A : [ 1, 4, 5, 8, 10 ]
 * B : [ 6, 9, 15 ]
 * C : [ 2, 3, 6, 6 ]
 * Output:
 * <p>
 * 1
 * <p>
 * Explanation: We get the minimum difference for a=5, b=6, c=6 as | maxRef(a,b,c) - minRef(a,b,c) | = |6-5| = 1.
 *
 * @author atang
 */
public class MinimizeAbsoluteDifference {

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        // each array and pointer will be referenced by an index.
        // eg. arrays[0] is A, pointers[0] is the pointer at A.
        final List<Integer>[] arrays = new List[]{A, B, C};
        final int[] pointers = new int[]{0, 0, 0};

        int minDifference = Integer.MAX_VALUE;

        while (true) {
            // reference of the current maximum value among all pointers.
            final int maxRef = maxRef(A.get(pointers[0]), B.get(pointers[1]), C.get(pointers[2]));
            // the other arrays should move their pointers up until they hit the greatest value <= max value.
            final List<Integer> otherRefs = otherRefs(maxRef);
            for (final int otherRef : otherRefs) {
                final List<Integer> otherArray = arrays[otherRef];
                int otherPointer = pointers[otherRef];
                while (otherPointer + 1 < otherArray.size() &&
                    otherArray.get(otherPointer + 1) <= arrays[maxRef].get(pointers[maxRef])) {
                    otherPointer++;
                }
                // update the pointers.
                pointers[otherRef] = otherPointer;
            }
            // calculate the absolute difference.
            final int maxValue = Math.max(C.get(pointers[2]), Math.max(A.get(pointers[0]), B.get(pointers[1])));
            final int minValue = Math.min(C.get(pointers[2]), Math.min(A.get(pointers[0]), B.get(pointers[1])));
            final int absoluteDifference = Math.abs(maxValue - minValue);
            if (absoluteDifference < minDifference) {
                minDifference = absoluteDifference;
            }
            // if all pointers are now at the end, break out of the loop.
            if (pointers[0] == A.size() - 1 && pointers[1] == B.size() - 1 && pointers[2] == C.size() - 1) {
                break;
            }
            // determine which pointer will increment next.  it should be the smallest of the three next values.
            // if the pointer is at the end of its array, fake the value to be Integer.MAX_VALUE so it will never
            // be the one to increment.
            final int nextAValue = (pointers[0] + 1 >= A.size()) ? Integer.MAX_VALUE : A.get(pointers[0] + 1);
            final int nextBValue = (pointers[1] + 1 >= B.size()) ? Integer.MAX_VALUE : B.get(pointers[1] + 1);
            final int nextCValue = (pointers[2] + 1 >= C.size()) ? Integer.MAX_VALUE : C.get(pointers[2] + 1);
            final int minRef = minRef(nextAValue, nextBValue, nextCValue);
            pointers[minRef]++;
        }
        return minDifference;
    }

    // utility function to retrieve the other references.
    private static List<Integer> otherRefs(final int ref) {
        final List<Integer> refs = new ArrayList<>(Arrays.asList(0, 1, 2));
        refs.remove((Integer) ref);
        return refs;
    }

    // utility function to determine the maximum reference.
    private static char maxRef(final int aValue, final int bValue, final int cValue) {
        if (aValue >= bValue && aValue >= cValue) {
            return 0;
        } else if (bValue >= aValue && bValue >= cValue) {
            return 1;
        } else {
            return 2;
        }
    }

    // utility function to determine the minimum reference.
    private static char minRef(final int aValue, final int bValue, final int cValue) {
        if (aValue <= bValue && aValue <= cValue) {
            return 0;
        } else if (bValue <= aValue && bValue <= cValue) {
            return 1;
        } else {
            return 2;
        }
    }
}