package org.PA_303_7_1_Practice_Assignment_Array;

public class Program4 {
    public static void main(String[] args){

        //4) I want you to get the largest integer in the array

        int[] myIntArray = {23, 45, 12, 67, 8, 32, 43, 46};

        int largest = myIntArray[0];
        for(int i = 0; i < myIntArray.length; i++){
            if (myIntArray[i] > largest){
                largest = myIntArray[i];
            }

            System.out.println("The largest integer in the array is: " + largest);
        }

    }
}
