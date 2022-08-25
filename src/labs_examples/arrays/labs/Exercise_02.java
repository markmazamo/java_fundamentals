package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 10 ");
        // assign input to variable as int
        int number = scanner.nextInt();

        for(int index = 0; index < array.length; index++){
            if(number == array[index]) {
                System.out.println("Your number is at the index of " + index);
            }
        }


    }
}