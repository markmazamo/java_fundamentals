package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();
        System.out.println(length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean b1 = str.equalsIgnoreCase(str2);
        System.out.println(b1);

        // please concatenate str & str2 and set the result to a new String variable below
        String newstring = str + " " + str2;
        System.out.println(newstring);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

    }


}