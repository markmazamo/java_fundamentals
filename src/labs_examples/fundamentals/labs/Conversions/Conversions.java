package labs_examples.fundamentals.labs.Conversions;

public class Conversions {
    public static void main(String[] args) {

        // please demonstrate converting an int to a double below  - example - why don't we need to cast the int to a double?  Answer:  Because we are widening.
        int num = 12345;
        double large = num;
        System.out.println(large);

        // please demonstrate casting a double to an int below
        double giant = 12345.12345;
        int small = (int) giant;
        System.out.println(small);

        // please demonstrate casting a double to a float below - I was expecting a result of 12345.1234567
        double crazyBig = 12345.1234512345;
        float notSoBig = (float) crazyBig;
        System.out.println(notSoBig);

        // please demonstrate casting a double with decimal values to a short
        double superBig = 12345.1234512345;
        short superSmall = (short) superBig;
        System.out.println(superSmall);

        // now print out the short value - what happened to the decimals?  Decimals were dropped.
        System.out.println(superSmall);

    }



}
