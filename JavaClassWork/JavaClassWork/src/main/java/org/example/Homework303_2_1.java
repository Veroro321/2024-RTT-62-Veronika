package org.example;

public class Homework303_2_1 {

    public static void main(String[] args){
//Write a program that declares two integer variables,
// assigns an integer to each, and adds them together.
// Assign the sum to a variable. Print out the result.
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;

        System.out.println("the sum of " + num1 + " and" + num2 + " is" + sum);


//Write a program that declares two double variables,
// assigns a number to each, and adds them together.
// Assign the sum to a variable. Print out the result.

        double num3 = 10.5;
        double num4 = 20.7;
        double sum1 = num3 + num4;
        System.out.println("Sum: " + sum);

        // Write a program that declares an integer variable and a double variable,
        // assigns numbers to each, and adds them together. Assign the sum to a variable.
        // Print out the result. What variable type must the sum be?
        int num5 = 10;
        double num6 = 20.3;
        double sum2 = num5 + num6;
        System.out.println("Sum: " + sum2);
        // the variable type must be a double, because if we put int the numbers will be cut off.

//Write a program that declares two double variables,
// assigns a number to each, and divides the larger
// by the smaller number. Assign the result to a variable.
// Print out the result. Now, cast the result to an integer.
// Print out the result again.

        double num7 = 25;
        double num8 = 3;
        double sum3 = num7 + num8;
        System.out.println("Sum: " + sum3);

        //Write a program that declares two integer variables, x and y,
        // and assigns the number 5 to x and the number 6 to y. Declare a variable q and
        // assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.

        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println("q: " + q);

        q = (int) (double) y; //note to self, explicit type casting is the process of assigning a larger to smaller
        System.out.println("q after casting it " + q);

        //Write a program that declares a named constant and uses it in a calculation.
        // Print the result.
        final double NUM9 = 40;
        double num10= 10;

        double num11 = NUM9 + num10;
        System.out.println("num11: " + num11);

        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called
        // subtotal and totalSale and complete an “order” for three items of the first product,
        // four items of the second product, and two items of the third product.
        // Add them all together to calculate the subtotal. Create a constant called SALES_TAX
        // and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.

        double blackCoffee = 2.0;
        double matchaTea = 5.5;
        double columbianCoffee= 4.3;

        int blackCoffeeQty = 3;
        int matchaTeaQty = 4;
        int columbianCoffeeQty = 2;

        double subtotal = (blackCoffee * blackCoffeeQty) + (matchaTeaQty * matchaTeaQty) + (columbianCoffee * columbianCoffeeQty);
        final double SALES_TAX = 0.07;

        double totalSale = subtotal * (1 + SALES_TAX);


    }
}
