package labs_examples.arrays.labs;

public class Array_REPL {
    public static void main(String[] args) {
        // please demonstrate how to declare and initialize a
        int[] scores = {67, 72, 81, 85, 100, 110, 145};
        System.out.println(scores.length);  // testing to see if code knows length of array

        // String array of size five below
        int[] temp = new int[5];

        // once initialized, please populate each index of the array
        temp[0] = 32;
        temp[1] = 45;
        temp[2] = 57;
        temp[3] = 89;
        temp[4] = 102;

        // once populated, please print out each element in the array
        // using a For Loop
        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
