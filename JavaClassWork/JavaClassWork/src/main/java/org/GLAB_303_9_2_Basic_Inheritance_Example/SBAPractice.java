package org.GLAB_303_9_2_Basic_Inheritance_Example;

public class SBAPractice {
    public static void main(String[] args){
        String s = "ABCDEFIGHIJKLMNOPQRSTUVWXYZ";

        //part 1 create a for loop to print each character of the string s on its own line
            for (int pos = 0; pos < s.length(); pos++) { //we want it to be descriptive so that is why we use pos instead od i
                System.out.println(s.charAt(pos));
            }

        //you can use the s.charAt(pos) function

        /* A
        B
        C
        D
        E
        F
        .....
         */

        //part 2, given the following Strings convert them to integer values Integer.valueOf()
        String ten = "10";
        String hundred = "100";

        int Value10 = Integer.valueOf(ten);
        System.out.println("Integer value is : " + Value10);

        int Value100 = Integer.valueOf(hundred);
        System.out.println("Integer value is : " + Value100);

        //part 3
        //given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};

        int sum = 0;
        for (int pos = 0; pos < array.length; pos++) {
            sum = sum + array[pos];
        }

        // part 4
        //given the array of string convert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};

        int sum2 = 0;

        for (int pos = 0; pos < nums.length; pos++) {

            int convertedNum = Integer.valueOf(nums[pos]);
            sum2 = sum2 + convertedNum;
        }
        System.out.println("The sum of the numbers is: " + sum2);

    }
}
