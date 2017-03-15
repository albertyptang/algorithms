package io.github.albertyptang.algorithms.leetcode.hard;

/**
 * 4. Median of Two Sorted Arrays
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays.
 *
 * TODO : The overall run time complexity should be O(log (m+n)).
 *
 * @author atang
 */
public class MedianOfTwoSortedArrays {

    public static double solve(int[] nums1, int[] nums2) {
        // find out what the index of the middle numbers would be if the two arrays were merged.
        final int length = nums1.length + nums2.length;
        final int mid1Index = (int) Math.ceil(length / 2D) - 1;
        final boolean twoMids = length % 2 == 0; // median is between two numbers if total length is even.

        // "merge" the array by iterating through both in order.
        int mergeP = 0; // pointer for the "merged" array.
        int nums1P = 0; // pointer for nums1
        int nums2P = 0; // pointer for nums2
        int mid1 = 0;
        int mid2 = 0;
        // the lower of the two elements will be "sorted" into "merged".
        while (mergeP <= mid1Index + 1) { // traverse through enough elements to include two medians.
            // check if nums2 has ended or if nums1 exists and has a lower value.
            if (nums2P > nums2.length - 1 || (nums1P <= nums1.length - 1 && nums1[nums1P] < nums2[nums2P])) {
                // set mids if the merge pointer has reached the appropriate index.
                mid1 = mergeP == mid1Index ? nums1[nums1P] : mid1;
                mid2 = (mergeP == mid1Index + 1 && twoMids) ? nums1[nums1P] : mid2;
                nums1P++;
            } else {
                mid1 = mergeP == mid1Index ? nums2[nums2P] : mid1;
                mid2 = (mergeP == mid1Index + 1 && twoMids) ? nums2[nums2P] : mid2;
                nums2P++;
            }
            mergeP++;
        }
        return twoMids ? (mid1 + mid2) / 2D : mid1;
    }
}
