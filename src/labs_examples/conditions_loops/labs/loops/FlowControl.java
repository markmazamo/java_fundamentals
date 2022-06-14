package labs_examples.conditions_loops.labs.loops;

public class FlowControl {
    public static void main(String[] args) {
        // please demonstrate the use of the "continue" keyword below within a for loop
        for(int num = 0; num < 21; num++) {
            if((num%2) !=0) {
                continue;
            }
            System.out.println(num);
        }

        // please demonstrate the use of the "break" keyword below in a do-while loop
        for(int x = 0; x < 10; x++) {
            if(x == 3 || x == 7) {
                // break will break out of the loop above when x hits 3
                break;
            }
            System.out.println("x is " + x);
        }
    }
}
