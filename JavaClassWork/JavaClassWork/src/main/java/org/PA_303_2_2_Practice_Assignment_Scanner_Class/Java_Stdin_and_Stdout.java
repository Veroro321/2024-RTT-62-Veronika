package org.PA_303_2_2_Practice_Assignment_Scanner_Class;
import java.util.Scanner;


public class Java_Stdin_and_Stdout {
    public static void main(String[] args) {

        // In this challenge, you must read 3 integers from stdin and then print them to stdout.
        // Each integer must be printed on a new line.
        // To make the problem a little easier, a portion of the code is provided for you in the editor below.

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

//In this challenge, you must read an integer,
// a double, and a String from stdin, then print the values according to the
// instructions in the Output Format section below. To make the problem a little easier,
// a portion of the code is provided for you in the editor.

        Scanner scan1 = new Scanner(System.in);
        int i = scan1.nextInt();
        double d = scan1.nextDouble();

        scan1.nextLine();

        String s = scan1.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }



}