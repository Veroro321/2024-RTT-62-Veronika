//package org.PA_303_4_1;
//package org.Control_Flow_Statements;
//import java.util.Scanner;
//
//public class ControlFlowStatements {
//    public static void main(String[] args) {
//        //Write a program that declares 1 integer variable x,
//        // and then assigns 7 to it. Write an if statement to print out “
//        // Less than 10” if x is less than 10. Change x to equal 15,
//        // and notice the result (console should not display anything).
//
//        int x = 7;
//
//        if (x < 10){
//            System.out.println("x is less than 10");
//        }
//
//        x = 15; //the reason why is cus there it's not true anymore
//
//        //2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
//        // Write an if-else statement that prints out “Less than 10” if x is less than 10,
//        // and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
//
//        int a = 7; //decided to put a instead of x as my variable declaration cus I put the all the word problems together.....
//        if (a < 10){
//            System.out.println("x is less than 10");
//        } else if (a > 10){
//            System.out.println("x is greater than 10");
//        }
//
//        a = 15;
//    }
//
//    //3. Write a program that declares 1 integer variable x,
//    // and then assigns 15 to it. Write an if-else-if statement that prints out
//    // “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater
//    // than 10 but less than 20, and “Greater than or equal to 20” if x is greater
//    // than or equal to 20. Change x to 50 and notice the result.
//
//    //int b = 15;
//
//    //if (b < 10) {
//    //   System.out.println("b is less than 10");
//    // } else if (b >= 10 && b < 20) {
//    //  System.out.println("Between 10 and 20");
//    // } else {
//    //   System.out.println("Greater than or equal to 20");
//    // }
//
//    //  int b = 50;
////}
//
//    //4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
//    // Write an if-else statement that prints “Out of range” if the number is less than
//    // 10 or greater than 20 and prints “In range” if the number is between 10 and 20
//    // (including equal to 10 or 20). Change x to 5 and notice the result.
//
//    int c = 15;
//
//        if (c < 10 || c > 20) {
//        System.out.println("Out of range");
//    } else {
//        System.out.println("In range");
//    }
//
//    // c = 5;
//
//    //5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F,
//    // according to the following criteria:
//    //A: 90-100
//    //B: 80-89
//    //C: 70-79
//    //D: 60-69
//    //F: <60
//    //Use the Scanner class to accept a number score from the user to determine the letter grade.
//    // Print out “Score out of range” if the score is less than 0 or greater than 100.
//
//    Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the score: ");
//    int score = scanner.nextInt(); // Accept a number score from the user
//
//        if (score < 0 || score > 100) {
//        System.out.println("Score out of range");
//    } else if (score >= 90 && score <= 100) {
//        System.out.println("Grade: A");
//    } else if (score >= 80 && score <= 89) {
//        System.out.println("Grade: B");
//    } else if (score >= 70 && score <= 79) {
//        System.out.println("Grade: C");
//    } else if (score >= 60 && score <= 69) {
//        System.out.println("Grade: D");
//    } else {
//        System.out.println("Grade: F");
//    }
//
//}
//
////6. Write a program that accepts an integer between 1 and 7 from the user.
//// Use a switch statement to print out the corresponding weekday.
//// Print “Out of range” if the number is less than 1 or greater than 7.
//// Do not forget to include “break” statements in each of your cases.
//
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//
//    System.out.print("Please, enter an integer between 1 and 7: ");
//    int dayNumber = scanner.nextInt();
//
//    switch (dayNumber) {
//        case 1:
//            System.out.println("Monday");
//            break;
//        case 2:
//            System.out.println("Tuesday");
//            break;
//        case 3:
//            System.out.println("Wednesday");
//            break;
//        case 4:
//            System.out.println("Thursday");
//            break;
//        case 5:
//            System.out.println("Friday");
//            break;
//        case 6:
//            System.out.println("Saturday");
//            break;
//        case 7:
//            System.out.println("Sunday");
//            break;
//        default:
//            System.out.println("Out of range");
//    }
//
//    scanner.close();
//}
//
//
////7. Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
////The U.S. federal personal income tax is calculated based on the filing status and taxable income.
////There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
////The tax rates for 2009 are shown below.
//
//System.out.print("Enter your filing status (1-4): ");
//int filingStatus = scanner.nextInt();
//
//System.out.print("Enter your taxable income: $");
//double income = scanner.nextDouble();
//
//
//
//}
