package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Teht10 {
    // Tehtävä 10
    public static HashMap<String, ArrayList<Integer>> drawNumbers() {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        HashMap<String, ArrayList<Integer>> numbers = new HashMap<>();

        int max = 50;
        int min = -50;
        int range = max - min + 1;

        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random() * range) + min;
            if(number > 0) {
                positives.add(number);
            } else if (number < 0) {
                negatives.add(number);
            } else {
                zeros.add(number);
            }
        }
        numbers.put("positive", positives);
        numbers.put("negative", negatives);
        numbers.put("zero", zeros);

        return numbers;
    }
}
