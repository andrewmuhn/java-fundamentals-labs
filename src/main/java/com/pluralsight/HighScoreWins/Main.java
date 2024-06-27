package com.pluralsight.HighScoreWins;

public class Main {
    public static void main(String[] args) {
        ParseScore.parseScore();
        CalculateWinner.calculateWinner();
        DisplayResults.displayResults();
    }
}
