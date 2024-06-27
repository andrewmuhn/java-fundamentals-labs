package com.pluralsight.HighScoreWins;

public class DisplayResults {
    public static void displayResults() {
        String[] teamNames = ParseScore.getTeamNames();
        String winningTeam = teamNames[CalculateWinner.getWinner()];
        int wonBy = Math.abs(CalculateWinner.getDifference());

        System.out.printf("Winner: %s won by %d", winningTeam, wonBy);
    }
}
