package labs_examples.conditions_loops.labs.loops;

public class ForLoops {
    public static void main(String[] args) {
        // please use a for loop below to print out every number between 0 & 100
        for(int num = 0; num < 101; num++) {
            System.out.println("The number is " + num);
        }

        // please use another for loop below to print out every odd number between 100 and 0 in descending order
        for(int odd = 1; odd < 101; odd+=2) {
            System.out.println("The odd number is " + odd);
        }

        // pleasure demonstrate "nesting" two for loops below
        for(int outer = 1; outer < 11; outer++) {
            System.out.println("Outer count is " + outer);
            for(int inner = 1; inner < 11; inner++) {
                System.out.println("Inner count is " + inner);
            }
        }
    }
}
