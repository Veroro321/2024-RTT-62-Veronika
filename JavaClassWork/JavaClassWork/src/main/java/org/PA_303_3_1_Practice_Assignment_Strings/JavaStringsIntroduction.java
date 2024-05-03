package org.PA_303_3_1_Practice_Assignment_Strings;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        //Given two strings of lowercase English letters,  and , perform the following operations:
        //Sum the lengths of  and .
        //Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
        //Capitalize the first letter in  and  and print them on a single line, separated by a space.

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();


        int sumLengths = A.length() + B.length();
        System.out.println(sumLengths);

        if (A.compareTo(B) > 0) { //we will use an if and else statement here to compare
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
    }
}
