package labs_examples.arrays.labs;

public class MultiArray_Practice {
    public static void main(String[] args) {

        int[][] teamScores = new int[5][5];  // initializing a new multidimensional array with 5 rows and 5 columns

        int count = 0;

        for (int i = 0; i < teamScores.length; i++) {  // i is the array row (counter)

            for (int j = 0; j < teamScores[i].length; j++) {   // j is the array column (counter)
                teamScores[i][j] = count;
                count +=2;

                System.out.print(teamScores[i][j] + " | ");
            }

            System.out.println();  // start a new line
        }
    }
}
