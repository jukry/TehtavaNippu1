package org.example;

import java.util.Arrays;

public class Teht5 {
    //Tehtävä 5
    public static int[] sortArrayAsc(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < (newArr.length - i - 1); j++) {
                int currentNum = newArr[j];
                int nextNum = 0;
                if (i + 1 >= newArr.length) {
                    nextNum = newArr[j];
                } else {
                    nextNum = newArr[j + 1];
                }
                if (currentNum > nextNum) {
                    newArr[j + 1] = currentNum;
                    newArr[j] = nextNum;
                }
            }

        }
        return newArr;
    }
}
