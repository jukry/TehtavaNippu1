package org.example;

public class Teht7 {
    // Tehtävä 7
    public static int fibonacci(int n) {
        int number = 0;
        int prev = 0;
        int curr = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                curr += prev;
            } else {
                curr += prev;
                prev = curr - prev;
            }
            if (i == n) {
                number = curr;
            }
        }
        return number;
    }
}
