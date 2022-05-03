package labs_examples.fundamentals.labs.Java_Operators;

public class Java_Operators {
    public static void main(String[] args) {

        // please demonstrate the use of all 5 arithmetic operators below (+, -, *, /, %)
        int add = 5 + 5;
        System.out.println(add);

        int sub = 10 - 5;
        System.out.println(sub);

        int mult = 5 * 5;
        System.out.println(mult);

        int div = 10 / 4;
        System.out.println(div);

        int mod = 10 % 4;
        System.out.println(mod);


        // please demonstrate the use of off 5 relational operators below - we'll cover "if-statements" shortly so I'll give you a hint here
        int a = 10;
        int b = 11;
        if (a < b){
            System.out.println("a is less than b");
        }
        // now your turn :)
        if (a > b){
                System.out.println("a is greater than b");
        }
        if (a == b){
                System.out.println("a is equal to b");
        }
        if (a <= b){
            System.out.println("a is less than or equal to b");
        }
        if (a >= b){
            System.out.println("a is greater than or equal to b");
        }

        // please demonstrate the use of all 4 logical operators below (AND, short-circuit AND, OR, short-circuit OR, XOR (exclusive or), and NOT )
        if (a < 20 & b < 20){
            System.out.println("both a & b are less than 20");
        }
        // now your turn :)

        // Logical AND
        if ((a < 20) & (b < 20)){
            System.out.println("both a & b are less than 20");
        }

        // Logical OR
        if (a < 20 | b < 20){
            System.out.println("either a or b is less than 20");
        }

        // Logical NOT
        if (a < 20){
            System.out.println("neither a or b is less than 20");
        }
    }
}
