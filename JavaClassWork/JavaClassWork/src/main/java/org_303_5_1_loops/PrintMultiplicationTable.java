package org_303_5_1_loops;

public class PrintMultiplicationTable {

    //Write a program that uses nested for loops to print a multiplication table.

    public static void main(String[] args) {
        int tableSize = 12;

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {

                System.out.println(i * j);
            }
            System.out.println();
        }
    }
}
