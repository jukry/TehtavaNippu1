package org.example;

import java.util.ArrayList;

public class Teht8 {
    // Tehtävä 8
    public static ArrayList<Integer> checkPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        int midPoint = n / 2;
        for (int i = midPoint; i <= n; i++) {
            if (isNumberPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isNumberPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int endPoint = (int) Math.sqrt(num);
        for (int i = 2; i <= endPoint; i++) {
            int remainder = num % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }

}
