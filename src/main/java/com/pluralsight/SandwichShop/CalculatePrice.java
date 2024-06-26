package com.pluralsight.SandwichShop;

import java.util.HashMap;

public class CalculatePrice {
    static double sandwichPrice;
    static double discount;
    static double sandwichBasePrice;
    static HashMap<Integer, Double> sandwichBasePrices;
    static HashMap<Integer, Double> sandwichLoadedPrices;
    public static void calculatePrice(int size, boolean loaded, double discountPercentage) {
        sandwichBasePrices = new HashMap<Integer, Double>();
        sandwichBasePrices.put(1, 5.45);
        sandwichBasePrices.put(2, 8.95);
        sandwichLoadedPrices = new HashMap<Integer, Double>();
        sandwichLoadedPrices.put(1, 1.00);
        sandwichLoadedPrices.put(2, 1.75);
        double loadedAddon = loaded ? sandwichLoadedPrices.get(size) : 0.00;
        sandwichBasePrice = sandwichBasePrices.get(size) + loadedAddon;
        discount = sandwichBasePrice * discountPercentage;
        sandwichPrice = sandwichBasePrice - discount;
    }
    public static double getSandwichPrice() {
        return sandwichPrice;
    }
    public static double getDiscount() {
        return discount;
    }
    public static double getSandwichBasePrice() {
        return sandwichBasePrice;
    }
}
