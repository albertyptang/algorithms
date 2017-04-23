//package io.github.albertyptang.algorithms.interviewbit.arrays;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
///**
// * Given the coordinates of a rectangle and N points on x-y plane, count the number of points that lie strictly
// * inside the rectangle. All the coordinates have integral values.
// *
// * Note: Rectangle may not be parallel to x or y axis.
// * Example:
// * Let the rectangle have coordinates (0,0), (-2,2), (2,6) and (4,4), then points (1,3), (2,4), (1,2)
// * lies inside the rectangle whereas (5,5), (-3,1) lies outside the rectangle.
// *
// *
// * Input Format:
// * A[i] and B[i] denote the coordinates of rectangle. C[i] and D[i] corresponds to x and y coordinates of i-th query point.
// *
// * @author atang
// */
//public class PointsInsideRectangle {
//
//    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D) {
//        Integer minXI = 0;
//        Integer maxXI = 0;
//        for (int i = 1; i < A.size(); i++) {
//            final int value = A.get(i);
//            minXI = value < A.get(minXI) ? i : minXI;
//            maxXI = value > A.get(maxXI) ? i : maxXI;
//        }
//        Integer minYI = 0;
//        Integer maxYI = 0;
//        for (int i = 1; i < B.size(); i++) {
//            final int value = B.get(i);
//            minYI = value < B.get(minYI) ? i : minYI;
//            maxYI = value > B.get(maxYI) ? i : maxYI;
//        }
//        final Map<Integer,Integer> xToMinY = new HashMap<>();
//        final Map<Integer,Integer> xToMaxY = new HashMap<>();
//        int maxY = B.get(minXI); // left most point.
//        int minY = B.get(minXI); // left most point.
//        for (int i = A.get(minXI) + 1; i < A.get(maxXI); i++) {
//            final int minX = A.get(minXI);
//            final int maxX = A.get(maxXI);
//            final int minYX = A.get(minYI);
//            final int maxYX = A.get(maxYI);
//
//            // find max y value (round down).
//
//
//
//
//        }
//
//
//        Integer minX = null;
//        Integer maxX = null;
//        for (final Integer x : A) {
//            if (minX == null || x < minX) {
//                minX = x;
//            } else if (maxX == null || x > maxX) {
//                maxX = x;
//            }
//        }
//        Integer minY = null;
//        Integer maxY = null;
//        for (final Integer y : B) {
//            if (minY == null || y < minY) {
//                minY = y;
//            } else if (maxY == null || y > maxY) {
//                maxY = y;
//            }
//        }
//        if (minX == null || maxX == null || minY == null || maxY == null) {
//            return 0;
//        }
//        final Set<Integer> indexesOfValidX = new HashSet<>();
//        for (int i = 0 ; i < C.size(); i++) {
//            if (C.get(i) > minX || C.get(i) < maxX) {
//                indexesOfValidX.add(i);
//            }
//        }
//
//
//        int count = 0;
//        for(final Integer indexOfValidX : indexesOfValidX) {
//            if (D.get(indexOfValidX) > maxY || D.get(indexOfValidX) < minY) {
//                count++;
//            }
//        }
//        return count;
//    }
//}
