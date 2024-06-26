package com.pluralsight.SandwichShop;

import java.util.HashMap;

public class CalculatePrice {
    public static double[] calculatePrice(int size, double discountPercentage) {
        double[] priceDiscountArr = new double[3];
        HashMap<Integer, Double> sandwichBasePrices = new HashMap<Integer, Double>();
        sandwichBasePrices.put(1, 5.45);
        sandwichBasePrices.put(2, 8.95);
        double discount = sandwichBasePrices.get(size) * discountPercentage;
        double sandwichPrice = sandwichBasePrices.get(size) - discount;
        priceDiscountArr[0] = sandwichPrice;
        priceDiscountArr[1] = discount;
        priceDiscountArr[2] = sandwichBasePrices.get(size);
        return priceDiscountArr;
    }
}
