package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * Given A, how many structurally unique BST’s (binary search trees) that store values 1...A?
 * <p>
 * Example :
 * <p>
 * Given A = 3, there are a total of 5 unique BST’s.
 * <p>
 * <p>
 * 1         3     3      2      1
 *  \       /     /      / \      \
 *   3     2     1      1   3      2
 *  /     /       \                 \
 * 2     1         2                 3
 *
 * @author atang
 */
public class UniqueBinarySearchTreesII {
    // explanation:
    // a = 4
    //  root 4
    //      /
    // (a = 3)
    //
    //  root 3
    //      / \
    // (a = 2) 4
    //
    //  root 2
    //      / \
    // (a = 1) (3 to 4, which is the same as 1 to 2, a = 2)
    //
    //  root 1
    //        \
    //         (2 to 4, which is the same as 1 to 3, a = 3)
    //
    // thus for every root, there are a total of left subtree * right subtree permutations.
    public int numTrees(int a) {
        final Map<Integer,Integer> maxToBsts = new HashMap<>();
        maxToBsts.put(1, 1);
        for (int i = 2; i <= a; i++) {
            // generate all answers up to a.
            int bsts = maxToBsts.get(i - 1) * 2; // i as root and 1 as root.
            for (int j = 2; j < i; j++) { // other possible roots.
                bsts += maxToBsts.get(j - 1) /* left subtrees */ * maxToBsts.get(i - j) /* right subtrees */;
            }
            maxToBsts.put(i, bsts);
        }
        return maxToBsts.get(a);
    }
}
