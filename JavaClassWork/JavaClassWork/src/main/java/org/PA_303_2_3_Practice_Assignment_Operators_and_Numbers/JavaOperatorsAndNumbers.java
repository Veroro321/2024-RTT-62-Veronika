package org.PA_303_2_3_Practice_Assignment_Operators_and_Numbers;

public class JavaOperatorsAndNumbers {
    public static void main(String[] args) {

       //Write a program that declares an integer variable, assigns a number,
        // and uses a postfix increment operator to increase the value.
        // Print the value before and after the increment operator.

        int a = 5;
        System.out.println("Before the increment operator" + a);

        a++;

        System.out.println("After the increment operator" + a);

        //Write a program that demonstrates at least three ways to increment
        // a variable by 1 and does this multiple times. Assign a value to an integer variable, print it,
        // increment by 1, print it again, increment by 1, and then print it again.

        int num = 2;

        //First way to increment a value, using the addition operator

        System.out.println("First way!");
        System.out.println("Before increment: " + num);
        num = num + 1;
        System.out.println("After increment: " + num);

        //Second way to increment a value, using the ++ operator, also know as the postfix operator
        System.out.println("Second way!");
        System.out.println("Before increment: " + num);
        num++;
        System.out.println("After increment: " + num);

        //Third way to increment a blue, using the compound operator
        System.out.println("third way");
        System.out.println("Before increment: " + num);
        num += 1;
        System.out.println("After increment: " + num);

        //Write a program that declares two integer variables: x, and y,
        // and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y,
        // and print the result. Notice the value of the sum (should be 14).
        // Now change the increment operator to postfix (x++) and re-run the program.
        // Notice what the value of the sum is. The first configuration incremented x,
        // and then calculated the sum, while the second configuration calculated the sum, and then incremented x.

        int x = 5;
        int y = 8;

        int sum = ++x + y;
        System.out.println("Sum: " + sum);

        sum = x++ + y;
        System.out.println("Sum: " + sum); //this is the postfix increment!

        //note to self, the prefix increment is when the value of x is first incremented by 1, and then updated

    }




    };

