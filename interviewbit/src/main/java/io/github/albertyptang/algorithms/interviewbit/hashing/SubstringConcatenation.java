package io.github.albertyptang.algorithms.interviewbit.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given a string, S, and a list of words, L, that are all of the same length.
 * <p>
 * Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.
 * <p>
 * Example :
 * <p>
 * S: "barfoothefoobarman"
 * L: ["foo", "bar"]
 * You should return the indices: [0,9].
 * (order does not matter).
 *
 * @author atang
 */
public class SubstringConcatenation {

    public static ArrayList<Integer> findSubstring(final String a, final List<String> b) {
        final ArrayList<Integer> results = new ArrayList<>();
        if (!b.isEmpty()) {
            final int concatLength = b.get(0).length() * b.size();
            // map of possible string to occurrence.
            final Map<String, Integer> bMap = new HashMap<>();
            for (final String s : b) {
                final int occurrence = bMap.containsKey(s) ? bMap.get(s) + 1 : 1;
                bMap.put(s, occurrence);
            }

            final int length = b.get(0).length();
            for (int i = 0; i < a.length() - concatLength + 1; i++) {
                final String subString = a.substring(i, i + length);
                if (bMap.containsKey(subString)) {
                    int j = i;
                    final Map<String, Integer> bMapClone = new HashMap<>(bMap);
                    while (j < i + concatLength) {
                        final String possibleConcat = a.substring(j, j + length);
                        if (bMapClone.containsKey(possibleConcat)) {
                            final int occurrence = bMapClone.get(possibleConcat);
                            if (occurrence == 1) {
                                bMapClone.remove(possibleConcat);
                            } else {
                                bMapClone.put(possibleConcat, occurrence - 1);
                            }
                            j += length;
                        } else {
                            break;
                        }
                    }
                    if (bMapClone.keySet().size() == 0) {
                        results.add(i);
                    }
                }
            }
        }
        return results;
    }
}
