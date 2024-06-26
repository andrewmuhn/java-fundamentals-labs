package com.pluralsight.TestStatistics;

public class DisplayStats {
    public static void displayStats(float mean, float median, float highScore, float lowScore) {
        System.out.printf("""
                Mean: %.1f\s
                Median: %.1f\s
                High Score: %.1f\s
                Low Score: %.1f\s
                """, mean, median, highScore, lowScore);
    }
}
