/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask_06_gamezone;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author acari
 */
public class RandomGuessWithExceptionHandling {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;

        while (guess != randomNumber) {

            System.out.print("Enter your guess between 1 and 100: ");

            try {
                guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct!");
                    System.out.println("It took you " + attempts + " attempts.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }

        }
    }

}
