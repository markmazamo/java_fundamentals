package labs_examples.conditions_loops.labs.loops;

public class NestedLoops {
    public static void main(String[] args) {

        // please run this application and take a look
        // at the output to get a good understanding of how
        // a nested loop operates

        System.out.println("Starting...");
        for (int i = 0; i < 10; i++){
            System.out.println("** Outter Loop - i = " + i + " **");
            for (int j = 0; j < 7; j++){
                System.out.print("Inner Loop: j = " + j + " | ");
            }
            // this is just two line breaks
            System.out.println("\n\n");
        }
        System.out.println("Done!");
    }
}
