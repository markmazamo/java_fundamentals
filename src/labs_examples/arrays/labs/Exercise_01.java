package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        int[] scores = new int[10]; // initialize array for test scores

        // initialize sum variable
        int sum = 0;

        Scanner scanner = new Scanner(System.in);  // initialize scanner for user input
        for(int count = 0; count < 10; count++) { // need 10 inputs from the user
            System.out.print("Enter a number between 1 & 100  ");  // ask for user input
            int number = scanner.nextInt();

            scores[count] = number;
            System.out.println("This is the score " + Arrays.toString(scores) + " for index " + count);
        }
    }
}