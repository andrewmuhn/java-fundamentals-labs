package com.pluralsight.HighScoreWins;

import java.util.HashMap;

public class CalculateWinner {
    static int winner;
    static int difference;
    public static void calculateWinner() {
        String[] teamNames = ParseScore.getTeamNames();
        int[] teamScores = ParseScore.getTeamScores();
        difference = teamScores[0] - teamScores[1];
        if (difference > 0) {
            winner = 0;
        } else winner = 1;
    }
    public static int getWinner() {
        return winner;
    }

    public static int getDifference() {
        return difference;
    }
}
