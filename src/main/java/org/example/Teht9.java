package org.example;

public class Teht9 {
    // Tehtävä 9
    public static String secondsToStringTime(int aSeconds) {
        int hours = aSeconds / 3600 % 60;
        int minutes = aSeconds / 60 % 60;
        int seconds = aSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
