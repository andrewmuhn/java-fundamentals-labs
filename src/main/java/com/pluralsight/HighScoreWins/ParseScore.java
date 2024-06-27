package com.pluralsight.HighScoreWins;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ParseScore {
        static private final Scanner scanner = new Scanner(System.in);
        static String[] teamNames;
        static int[] teamScores = new int[2];

    public static void parseScore() {
        System.out.print("Please enter a game score:  ");
        String[] userInput = scanner.nextLine().split("\\|");
        teamNames = userInput[0].split(":");
        String[] teamStringScores = userInput[1].split(":");
        for (int i = 0; i < teamStringScores.length; i++) {
            teamScores[i] = Integer.parseInt(teamStringScores[i]);
        }
    }

    public static String[] getTeamNames() {
        return teamNames;
    }

    public static int[] getTeamScores() {
        return teamScores;
    }
}
