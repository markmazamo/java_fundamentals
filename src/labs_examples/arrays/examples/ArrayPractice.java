package labs_examples.arrays.examples;

import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
        int i = 10;
        int[] nums = new int[10]; //declare an int array of size 5

        //remember that array indices start at zero
        nums[0] = 24;
        nums[1] = 77;
        nums[2] = 45;
        nums[3] = 93;
        nums[4] = 11;
        for(int i2 = 0; i2 < nums.length; i2++) {
            System.out.println(nums[i2]);
        }
        int i3 = nums[2];

        ArrayList<Integer> numsList = new ArrayList<Integer>();
        numsList.add(22);
        int i4 = numsList.get(0);

        if(numsList.contains(22)) {
            System.out.println("22 found");
        }

    }
}
