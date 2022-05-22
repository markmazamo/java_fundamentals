package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);

        // 2) prompt user
        System.out.println("Enter a number for the day of the week  ");

        // 3) assign input to variable as int
        int weekday = scanner.nextInt();

        // 4) write completed code here
        if (weekday == 1) {
            System.out.println("The day of the week is Sunday");
        }
        else if (weekday == 2) {
            System.out.println("The day of the week is Monday");
        }
        else if (weekday == 3) {
            System.out.println("The day of the week is Tuesday");
        }
        else if (weekday == 4) {
            System.out.println("The day of the week is Wednesday");
        }
        else if (weekday == 5) {
            System.out.println("The day of the week is Thursday");
        }
        else if (weekday == 6) {
            System.out.println("The day of the week is Friday");
        }
        else if (weekday == 7) {
            System.out.println("The day of the week is Saturday");
        }


    }
}
