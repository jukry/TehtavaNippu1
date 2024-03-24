package org.example;

public class Teht4 {
    // Tehtävä 4
    public static int[] getMaxValueInMatrix(int[][] matrix) {
        // Tehtävä 4
        int max = 0;
        int[] indexOfMax = {};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentNum = matrix[i][j];
                if (currentNum > max) {
                    max = currentNum;
                    indexOfMax = new int[]{i, j};
                }
            }
        }
        return indexOfMax;
    }
}
