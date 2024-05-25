//package org._303_12_1;
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class Exception {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int result = a / b;
//            System.out.println(result);
//        } catch (InputMismatchException e) {
//            System.out.println("java.util.InputMismatchException");
//        } catch (ArithmeticException e) {
//            System.out.println("java.lang.ArithmeticException: / by zero");
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            scanner.close();
//        }
//
//    }
//}
