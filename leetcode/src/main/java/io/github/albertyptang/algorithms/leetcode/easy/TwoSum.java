package io.github.albertyptang.algorithms.leetcode.easy;

import io.github.albertyptang.util.collection.array.HashTable;

/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * @author atang
 */
public class TwoSum {

    public int[] twoSum(final int[] nums, final int target) {

        // loop through nums to shove them into some storage and check if (target - nums) exists in said storage.

        // storage index is the num value, storage value is the num index.
        final HashTable<Integer,Integer> hashTable = new HashTable<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final Integer complement = hashTable.get(target - num);
            // sum exists.
            if (complement != null) {
                return new int[]{complement, i};
            } else {
                hashTable.put(num, i);
            }
        }
        // empty array if there is no solution.
        return new int[]{};
    }
}
