package labs_examples.conditions_loops.labs.loops;

public class Loops {
    public static void main(String[] args) {
        // declare a counter variable to use in our while loop (don't forget to increment it as you loop!)
        int count = 0;

        while(count < 10){
            int count2 = 0;
            System.out.println("count is " + count + "*******");
            while(count2 < 10) {
                System.out.println("Count 2 is " + count2);
                count2++;
            }
            count++;
        }
        // please use a while loop to print out every 3rd number between 0 and 100 below
        int num = 3;
        while(num < 101){
            System.out.println("number is " + num);
            num +=3;
        }

        // please use a do-while loop to print out every 5th number below
        int fives = 5;
        do{
            System.out.println("Cost is " + fives);
            fives +=5;
        } while(fives < 101);
    }
}
