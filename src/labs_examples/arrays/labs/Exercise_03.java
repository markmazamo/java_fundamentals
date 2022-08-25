package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] mult = new int[5][5];                       // establish a new array called "mult" that is 5 arrays (rows) of 5 values (columns)
        int value = 0;                                      // create a counter to populate the values of the arrays
        for (int i = 0; i < mult.length; i++) {             // initial loop index of i
            for (int j = 0; j < mult[i].length; j++) {      // secondary loop of index j
                value +=3;                                  // increment counter "value" by 3 each iteration of the loop
                mult[i][j] = value;                         // populate the value of the array at index [i][j]
                System.out.print(value + " ");              // print the value of the array at index [i][j]
            }
            System.out.println();                           //  start a new print line for the next array
        }



    }
}
