package org.example;

import java.util.Arrays;

public class Teht6 {
    // Tehtävä 6
    public static boolean isPalindrome(String word) {
        word = word.replaceAll("\\s", "").trim().toLowerCase();
        char[] wordToCharArray = word.toCharArray();
        char[] wordInArray = new char[word.length()];
        char[] wordInArrayReverse = new char[word.length()];

        for (int i = 0; i < wordToCharArray.length; i++) {
            char letter = wordToCharArray[i];
            char letterReverse = wordToCharArray[wordToCharArray.length - i - 1];
            wordInArray[i] = letter;
            wordInArrayReverse[i] = letterReverse;

        }
        return Arrays.toString(wordInArray).equals(Arrays.toString(wordInArrayReverse));
    }
}
