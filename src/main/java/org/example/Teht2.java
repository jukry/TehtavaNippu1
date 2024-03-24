package org.example;

public class Teht2 {
    // Tehtävä 2
    public static void printChristmasTree(int height) {
        int asteriskCount = 1;
        int floor = height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < floor; j++) {
                System.out.print(" ");
            }
            for (int h = 0; h < asteriskCount; h++) {
                System.out.print("*");
            }
            System.out.println();
            asteriskCount += 2;
            floor -= 1;
        }
    }
}
