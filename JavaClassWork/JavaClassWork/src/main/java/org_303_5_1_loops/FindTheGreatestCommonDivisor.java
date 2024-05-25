//package org_303_5_1_loops;
//import java.util.Scanner;
//
//public class FindTheGreatestCommonDivisor {
//
//    //Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
//    //Examples:
//    //Enter 2 and 4. The gcd is 2.
//    //Enter 16 and 24.  The gcd is 8.
//    //How do you find the gcd?
//    //Name the two input integers n1 and n2.
//    //You know number 1 is a common divisor, but it may not be the gcd.
//    //Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter two positive integers
//        System.out.print("Enter the first positive integer: ");
//        int n1 = scanner.nextInt();
//
//        System.out.print("Enter the second positive integer: ");
//        int n2 = scanner.nextInt();
//
//       // to find the GCD between two numbers we first have to find all the common divisors of both numbers
//        System.out.println("The divisors of " + n1 + "and  " + n2 + " are:"); // this code is very redundant....
//        // but then I found about the math.max method, which takes two arguments and then returns
//        // the largest of the two numbers....
//        //for (int i = 1; i <= n1; i++) {
//           // if (n1 % i == 0) {
//             //   System.out.println(i);
//           // }
//       // }
//       // for (int a = 1; a <= n2; a++) {
//           // if (n2 % a == 0) {
//               // System.out.println(a);
//            //}
//
//        public static int findGCD(int a, int b) {
//            int gcd = 1; // Initialize GCD to 1
//
//            // Loop from 1 up to the minimum of the two numbers
//            for (int i = 1; i <= Math.min(a, b); i++) {
//                // Check if both numbers are divisible by the current number (i)
//                if (a % i == 0 && b % i == 0) {
//                    gcd = i; // Update the GCD if the current number is a common divisor
//                }
//            }
//            return gcd;
//        }
//
//        }
//        // Output the result
//        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");
//    }
//
//
//}
