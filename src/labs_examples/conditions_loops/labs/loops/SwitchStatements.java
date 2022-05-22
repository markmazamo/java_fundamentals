package labs_examples.conditions_loops.labs.loops;

public class SwitchStatements {
    public static void main(String[] args) {
        // please demonstrate the use of a switch statement below - have a "System.out.println()" statement print for each "case" - be sure to include "break" statements in each case
        int day = 5;
        int days = 3;

        switch(day) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
        }

        // once you've got that done - run the switch statement with and without the break statements for each case - what happens when we don't have break statements?

        switch(days) {
            case 1:
                System.out.println("Today is Sunday");

            case 2:
                System.out.println("Today is Monday");

            case 3:
                System.out.println("Today is Tuesday");

            case 4:
                System.out.println("Today is Wednesday");

            case 5:
                System.out.println("Today is Thursday");

            case 6:
                System.out.println("Today is Friday");

            case 7:
                System.out.println("Today is Saturday");
        }
    }
}
