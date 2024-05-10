package org.PA_303_7_1_Practice_Assignment_Array;

public class Program5 {
    public static void main(String[] args){

        //5) I want you to calculate the average value in the array as a double.
        // Average is the sum of all elements in the array divided by the length of the array

        int[] myIntArray = {23, 45, 62, 22, 43, 10, 78};

        int sum = 0; //Q gives me an error when I just declare it e.g., int sum; vs int sum = 0;

        for (int pos = 0; pos < myIntArray.length; pos++) {
            sum = sum + myIntArray[pos]; //adding each element

            double average = (double) sum / myIntArray.length; // then we will calculate the average by diving

        }

    }
}



