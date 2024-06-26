package com.pluralsight.SandwichShop;

public class ApplySalesTax {
    static double SALES_TAX = .0825;
    public static double[] appleSalesTax (double sandwichPrice) {
        double[] totalPriceArr = new double[2];
        double salesTax = sandwichPrice * SALES_TAX;
        double totalPrice = sandwichPrice + salesTax;
        totalPriceArr[0] = totalPrice;
        totalPriceArr[1] = salesTax;
        return totalPriceArr;
    }
}
