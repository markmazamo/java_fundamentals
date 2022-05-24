package labs_examples.conditions_loops.labs.loops;

public class SwitchQuiz {
    public static void main(String[] args) {

        int num = -1;
        String str = "three";

        switch(str) {
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 3;
                break;
            case "four":
                num = 4;
                break;
            default :
                num = -1;
        }

        System.out.println(num);
    }
}
