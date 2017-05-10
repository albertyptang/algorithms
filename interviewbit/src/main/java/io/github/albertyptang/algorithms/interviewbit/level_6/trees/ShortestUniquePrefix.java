package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import java.util.ArrayList;

/**
 * Find shortest unique prefix to represent each word in the list.
 * <p>
 * Example:
 * <p>
 * Input: [zebra, dog, duck, dove]
 * Output: {z, dog, du, dov}
 * where we can see that
 * zebra = z
 * dog = dog
 * duck = du
 * dove = dov
 * NOTE : Assume that no word is prefix of another. In other words, the representation is always possible.
 *
 * @author atang
 */
public class ShortestUniquePrefix {

    private static class Trie {
        private int count = 1;
        private final Trie[] alphabet = new Trie[26];

        private void add(final String s) {
            final int charInt = s.charAt(0) - 97;
            Trie letterTrie = alphabet[charInt];
            if (letterTrie == null) {
                letterTrie = new Trie();
                alphabet[charInt] = letterTrie;
            } else {
                letterTrie.count++;
            }
            if (s.length() > 1) {
                letterTrie.add(s.substring(1, s.length()));
            }
        }

        private String getUniquePrefix(final String s) {
            final int charInt = s.charAt(0) - 97;
            Trie letterTrie = alphabet[charInt];

            final StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));

            if (letterTrie == null || letterTrie.count < 2) {
                return sb.toString();
            } else if (s.length() > 1) {
                return sb.append(letterTrie.getUniquePrefix(s.substring(1, s.length()))).toString();
            }
            return "";
        }
    }

    public static ArrayList<String> prefix(final ArrayList<String> a) {
        final ArrayList<String> results = new ArrayList<>();
        final Trie trie = new Trie();
        for (final String s : a) {
            trie.add(s);
        }
        for (final String s : a) {
            results.add(trie.getUniquePrefix(s));
        }
        return results;
    }
}
