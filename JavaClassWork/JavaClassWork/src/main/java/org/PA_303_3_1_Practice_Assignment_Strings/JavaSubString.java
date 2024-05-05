package org.PA_303_3_1_Practice_Assignment_Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class JavaSubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Given a string, , and two indices,  and ,
// print a substring consisting of all characters in the inclusive range from  to .
// You'll find the String class' substring method helpful in completing this challenge.

        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String substring = S.substring(start, end + 1); //why is this throwing me an error....?

        System.out.println(substring);
    }


    }

