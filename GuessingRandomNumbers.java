/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.guessingrandomnumbers;

/**
 *
 * @author VU-STUDENT
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingRandomNumbers {
    public static void main(String[] args){
        Random rand = new Random();
        int targetNumber = rand.nextInt(101); // 0 to 100 inclusive
        Scanner scanner = new Scanner(System.in);
        int guess = -1;

        System.out.println("Welcome to my Number Game");
        System.out.println("Imagine a number between 0 and 100");
        System.out.println("Guess it and May The Best Player Win");

        while(guess != targetNumber){
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if (guess < 0 || guess > 100) {
                    System.out.println("Please enter a number between 0 and 100.");
                    continue;
                }

                if (guess < targetNumber) {
                    System.out.println("Very low! Please, try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Very high! Please, try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            } else {
                System.out.println("That is not a valid number. Please enter an integer between 0 and 100.");
                scanner.next(); // clear invalid input
            }
        }
        scanner.close();
    }
}

