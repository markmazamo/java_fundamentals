package labs_examples.arrays.labs;

public class Array_Practice {

    public static void main(String[] args) {

        int[] temps = new int[5];

        temps[0] = 83;
        temps[1] = 95;
        temps[2] = 88;
        temps[3] = 93;
        temps[4] = 87;

        System.out.println("The length of the Temps array is " + temps.length);

        for(int i = 0; i < temps.length; i++){
            System.out.println("The temperature on Day " + i + " is " + temps[i] + " degrees.");

        }
    }
}
