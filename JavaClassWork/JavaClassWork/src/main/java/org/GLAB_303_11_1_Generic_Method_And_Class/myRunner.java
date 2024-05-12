package org.GLAB_303_11_1_Generic_Method_And_Class;

public class myRunner {
    public static void main(String[] args) {
// initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char
    }

}
