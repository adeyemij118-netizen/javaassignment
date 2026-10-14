package com.joshua;

public class SimplePurchaseCalculation {
    public static void main(String[] args) {
        int pricePerBook = 3500;
        int numberOfBooks = 4;

        int totalPrice = pricePerBook * numberOfBooks;

        System.out.println("The total price for " + numberOfBooks + " books is: " + totalPrice);
    }
}
