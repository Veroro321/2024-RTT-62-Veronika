package org.GLAB_303_2_1_Core_Java_Operators;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int age = 18;
        String result = age < 100 ?
                "Less than 100" : "Greater than 100";
        System.out.println(result); //Less than 100
    }

}
