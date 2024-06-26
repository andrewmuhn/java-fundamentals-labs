package com.pluralsight.TestStatistics;

import java.util.Arrays;

public class CalculateTestStats {
    public static float getMean(float[] testScores) {
        float sum = 0;
        for (float score : testScores) {
            sum += score;
        }
        return sum/testScores.length;
    }

    public static float getHighScore(float[] testScores) {
        float highScore = testScores[0];
        for (float score : testScores) {
            if (score > highScore) {
                highScore = score;
            }
        }
        return highScore;
    }

    public static float getLowScore(float[] testScores) {
        float lowScore = testScores[0];
        for (float score : testScores) {
            if (score < lowScore) {
                lowScore = score;
            }
        }
        return lowScore;
    }

    public static float getMedian(float[] testScores) {
        Arrays.sort(testScores);
        return testScores[testScores.length/2];
    }
}
