package com.pluralsight.RollTheDice;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.printf("Roll %d:\t%d\t%d\tSum:\t%d\n", i, roll1, roll2, sum);
            switch (sum) {
                case 2:
                    count2++;
                    break;
                case 4:
                    count4++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
            }
        }

        System.out.printf("""
                2's: %d\s
                4's: %d\s
                6's: %d\s
                7's: %d\s
                """, count2, count4, count6, count7);
    }
}
