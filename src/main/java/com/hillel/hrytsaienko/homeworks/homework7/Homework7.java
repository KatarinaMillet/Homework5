package com.hillel.hrytsaienko.homeworks.homework7;
import java.util.Random;
import java.util.Scanner;
public class Homework7 {
    public static void main(String[] args) {
     // Random rand = new Random();
    // int magicNum = rand.nextInt(11);// можна зробити рандомні числа
        int magicNum = 7;
        int attempts = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("I'm thinking of a number between 0 and 10. Can you guess the number?");

    while (attempts < 3) {
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();
        attempts++;

        if (guess == magicNum) {
            System.out.println("Congratulations, you guessed the number!");
            break;
        } else if (guess < magicNum) {
            System.out.println("Your guess is too low. Try again.");
        } else {
            System.out.println("Your guess is too high. Try again.");
        }
    }

    if (attempts == 3) {
        System.out.println("Sorry, you didn't guess the number. The number was " + magicNum);
    }
}
}
