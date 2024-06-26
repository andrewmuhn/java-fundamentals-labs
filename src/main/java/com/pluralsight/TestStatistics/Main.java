package com.pluralsight.TestStatistics;

public class Main {
    public static void main(String[] args) {
        float[] testScores = TestScoresArray.getTestScores();

        float mean = CalculateTestStats.getMean(testScores);
        float median = CalculateTestStats.getMedian(testScores);
        float highScore = CalculateTestStats.getHighScore(testScores);
        float lowScore = CalculateTestStats.getLowScore(testScores);

        DisplayStats.displayStats(mean, median, highScore, lowScore);
    }
}
