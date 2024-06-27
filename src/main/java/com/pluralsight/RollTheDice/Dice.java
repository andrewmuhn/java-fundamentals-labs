package com.pluralsight.RollTheDice;

public class Dice {
    public int roll() {
        int minValue = 1;
        int maxValue = 6;
        return minValue + (int)(Math.random() * maxValue);
    }
}
