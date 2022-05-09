package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        // rad is the radius of the cylinder
        // h is the height of the cylinder
        // pi is the value for pi
        // vol the volume of the cylinder is equal to pi * radius squared * height
        float rad = 3.14f;
        float h = 5f;
        float pi = 3.1415926f;
        float vol = pi * (rad * rad) * h;
        System.out.println("The volume of the cylinder is " + vol);


    }
}