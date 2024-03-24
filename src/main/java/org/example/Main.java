package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        double distance = Teht1.calculateDistance(new int[]{0, 0}, new int[]{0, 3});
        System.out.println(distance);

        Teht2.printChristmasTree(3);
        Teht2.printChristmasTree(5);

        LaskePintaAlat pintaAlat = new LaskePintaAlat();
        double ympyranPintaAla = LaskePintaAlat.laskeYmpyra(2);
        System.out.println("Ympyrän pinta-ala: " + ympyranPintaAla);

        double nelionPintaAla = LaskePintaAlat.laskeNelio(2);
        System.out.println("Neliön pinta-ala: " + nelionPintaAla);

        double kolmionPintaAla = LaskePintaAlat.laskeSuorakulmainenKolmio(6, 50);
        System.out.println("Suorakulmaisen kolmion pinta-ala: " + kolmionPintaAla);

        int[] maxValueInMatrix = Teht4.getMaxValueInMatrix(new int[][]{{1, 5, 7}, {9, 3, 1}, {0, 1, 1}});
        System.out.println("Matriisin suurimman luvun indeksi: " + Arrays.toString(maxValueInMatrix));

        int[] sortArray = Teht5.sortArrayAsc(new int[]{8, 3, 2, 7});
        System.out.println(Arrays.toString(sortArray));

        boolean testPalindrome = Teht6.isPalindrome("aivot avAAvat ovia");
        System.out.println("Onko palindromi: " + testPalindrome);

        int fiboNum = Teht7.fibonacci(3);
        System.out.println("Fibonaccinumero: " + fiboNum);

        ArrayList<Integer> primes = Teht8.checkPrimes(10);
        System.out.println(primes);

        String time = Teht9.secondsToStringTime(3661);
        System.out.println(time);

        HashMap<String, ArrayList<Integer>> numbersDrawn = Teht10.drawNumbers();
        System.out.println(numbersDrawn);
    }
}
