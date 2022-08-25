package labs_examples.arrays.labs;

public class Multi_Array_REPL {
    public static void main(String[] args) {

        // please demonstrate how to declare a Two-Dimensional Array
        // with a height of 4 and a width of 5 below

        int[][] scores = new int[4][5]; // initialize new multidim array call scores

        // using a nested for loop, please populate every index in the 2-D Array

        int count = 0;

        for (int i = 0; i < scores.length; i++) {  // populate the md array
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = count;
                count++;

            // once populated, use a nested for loop to print each element in the 2-D array
            System.out.print(scores[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
