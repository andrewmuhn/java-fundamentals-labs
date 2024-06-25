package com.pluralsight.PayrollCalculator;

public class FederalTaxRate {
    static double[][] federalTaxTable;
    static {
        federalTaxTable = new double[3][3];
        federalTaxTable[0][0] = .07;
        federalTaxTable[0][1] = .06;
        federalTaxTable[0][2] = .04;

        federalTaxTable[1][0] = .10;
        federalTaxTable[1][1] = .10;
        federalTaxTable[1][2] = .08;

        federalTaxTable[2][0] = .15;
        federalTaxTable[2][1] = .13;
        federalTaxTable[2][2] = .11;
    }

    public static double federalTaxRate(double weeklyGrossPay, int filingStatus) {
        int incomeBracket;
        if (weeklyGrossPay <= 800.00) {
            incomeBracket = 0;
        } else if (800.01 <= weeklyGrossPay && weeklyGrossPay <= 1600.00) {
            incomeBracket = 1;
        } else {
            incomeBracket = 2;
        }
        return federalTaxTable[incomeBracket][filingStatus - 1];
    }
}
