package io.github.albertyptang.algorithms.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 *
 * For example:
 *
 * Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 *
 * Note: The result may be very large, so you need to return a string instead of an integer.
 *
 * @author atang
 */
public class LargestNumber {

    public static String largestNumber(final List<Integer> a) {
        final List<List<String>> elements = a.stream()
            .map(i -> Collections.singletonList(String.valueOf(i)))
            .collect(Collectors.toList());
        final String result = String.join("", mergeSort(elements).get(0));
        return result.charAt(0) == '0' ? "0" : result;
    }

    private static List<List<String>> mergeSort(final List<List<String>> elements) {
        if (elements.size() < 2) {
            return elements;
        }
        final List<List<String>> partiallySortedElements = new ArrayList<>();
        for (int i = 0; i < elements.size(); i+=2) {
            final List<String> array1 = elements.get(i);
            if (i + 1 >= elements.size()) {
                partiallySortedElements.add(array1);
            } else {
                final List<String> sortedElement = new ArrayList<>();
                final List<String> array2 = elements.get(i + 1);
                int elementIndex1 = 0;
                int elementIndex2 = 0;
                while (elementIndex1 < array1.size() || elementIndex2 < array2.size()) {
                    if (elementIndex1 == array1.size()) {
                        sortedElement.addAll(array2.subList(elementIndex2, array2.size()));
                        break;
                    } else if (elementIndex2 == array2.size()) {
                        sortedElement.addAll(array1.subList(elementIndex1, array1.size()));
                        break;
                    }
                    final String element1 = array1.get(elementIndex1);
                    final String element2 = array2.get(elementIndex2);
                    if (Long.valueOf(element1 + element2) > Long.valueOf(element2 + element1)) {
                        sortedElement.add(element1);
                        elementIndex1++;
                    } else {
                        sortedElement.add(element2);
                        elementIndex2++;
                    }
                }
                partiallySortedElements.add(sortedElement);
            }
        }
        return mergeSort(partiallySortedElements);
    }
}