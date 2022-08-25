package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] scores = {
                {234, 287},
                {198, 203, 182},
                {270}
        };
        for (int i = 0; i < scores.length; i++) {               // initial loop index of i
            for (int j = 0; j < scores[i].length; j++) {        // secondary loop of index j
                System.out.print(scores[i][j] + " ");           // print the value of the array at index [i][j]
            }
            System.out.println();                               //  start a new print line for the next array

        }
    }
}