package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        // initiate multi-dim array called "table" and populate values using declaration syntax
        int[][] table = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };

        /**
        // print out every other element in reverse order using nested for loop
        for (int i = table.length; i <= 0; i -=2){
            for (int j = table[i].length; j <= 0; j -=2){
                System.out.print(table[i][j] + " ");
            }
        }
        */

        // print out every other element in reverse order
        int x = table.length;               // x = 3
        int y = table[x] = table.length;    // y = 4
        System.out.print(table[x][y] + " ");

    }
}
