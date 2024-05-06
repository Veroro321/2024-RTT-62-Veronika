package org.PA_303_7_1_Practice_Assignment_Array;

public class Program3 {
    public static void main(String[] args){

        //3) I want you to get the smallest integer in the array

        int[] myIntArray = {23, 45, 12, 67, 9, 32, 56, 78, 3, 91};
        int smallest = myIntArray[0];
        for (int i = 1; i < myIntArray.length; i++) {
            if (myIntArray[i] < smallest) {
                smallest = myIntArray[i];
            }
        }

        // Print the smallest integer
        System.out.println("The smallest integer in the array is: " + smallest);
    }


    }


