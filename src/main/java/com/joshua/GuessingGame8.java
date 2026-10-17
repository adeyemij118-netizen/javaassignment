package com.joshua;

import java.lang.String;
import java.util.Scanner;

public class GuessingGame8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetNumber = 2;
        int joshuaGuess = 0;

        System.out.println("Guess a number between 1 and 100!");

        while (joshuaGuess != targetNumber) {
            System.out.print("Enter your number: ");
            joshuaGuess = scanner.nextInt();

            if (joshuaGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (joshuaGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("clap for yourself Joshua Correct You win!");
            }
        }
        scanner.close();
    }
}
