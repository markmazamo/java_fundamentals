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

//        int[] scores = new int[10]; // initialize array for 10 test scores
        int sum = 0; // initialize sum variable
        double avg = 0; // initial average variable

        Scanner scanner = new Scanner(System.in);  // initialize scanner for user input
//        for(int count = 0; count < scores.length; count++) {  // need 10 inputs from the user
//            System.out.print("Enter a number between 1 & 100 ");  // ask for user input
//            int number = scanner.nextInt();  // collect user input as number
//
//            scores[count] = number;  // assign the inputted number to the scores array at index x
//            sum += number;  // adding user inputted number to sum
//            System.out.println("This is the score " + scores[count] + " for index " + count);  // print the score for each index
//        }
        System.out.println("Please enter your numbers separated by dashes   ");
        String input = scanner.next();
        String[] inputArr = input.split("-");
        int[] scores = new int[inputArr.length];

        for(int num = 0; num < inputArr.length; num++) {
            int val = Integer.parseInt(inputArr[num]);
            scores[num] = val;
        }

        for(int index = 0; index < scores.length; index++) {
            System.out.print(scores[index]);
            if(index < 9) {
                System.out.print(", ");
            }
            sum += scores[index];
        }
        System.out.println();

        System.out.println(Arrays.toString(scores));

        Arrays.stream(scores).forEach(System.out::print);
        System.out.println();

//        System.out.println("This is the full array " + );  // need help from Ryan here - how do I print the entire array??  Array.StringTo  ?
        System.out.println("This is the sum " + sum);  // print the sum


        // cast sum and scores to double
        avg = (double) sum / scores.length;  // calculate the average
        System.out.println("This is the average " + avg);
    }
}