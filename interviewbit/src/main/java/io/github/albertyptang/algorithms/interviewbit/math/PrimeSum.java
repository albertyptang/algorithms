package io.github.albertyptang.algorithms.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 * If there are more than one solutions possible, return the lexicographically smaller solution.
 *
 * @author atang
 */
public class PrimeSum {

    // map of integers and whether or not it is a prime number.
    private static Map<Integer,Boolean> intToIsPrime = new HashMap<>();

    public static ArrayList<Integer> primesum(final int a) {
        if (a < 3 || a % 2 != 0) {
            return null;
        }
        for (int i = 1; i < a; i++) {
            if (isPrime(i) && isPrime(a - i)) {
                return new ArrayList<>(Arrays.asList(i, a - i));
            }
        }
        return null;
    }

    private static boolean isPrime(final int num) {
        if (intToIsPrime.containsKey(num)) {
            return intToIsPrime.get(num);
        }
        if (num == 2) { // 2 is prime.
            intToIsPrime.put(num, true);
            return true;
        } else if (num < 2) { // 0 or 1 or negatives are not prime.
            intToIsPrime.put(num, false);
            return false;
        } else if (num % 2 == 0) { // even numbers are not prime.
            intToIsPrime.put(num, false);
            return false;
        }
        // only check odd numbers.
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                intToIsPrime.put(num, false);
                return false;
            }
        }
        intToIsPrime.put(num, true);
        return true;
    }
}
