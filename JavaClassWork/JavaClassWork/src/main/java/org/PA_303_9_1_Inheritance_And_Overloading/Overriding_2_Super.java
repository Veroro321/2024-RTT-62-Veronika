package org.PA_303_9_1_Inheritance_And_Overloading;

public class Overriding_2_Super {
    public static void main(String[] args) {
            Motorcycle M = new Motorcycle();

        }
    }

    class Cycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    class Motorcycle extends Cycle {
    @Override
        String define_me() {
            return "a cycle with an engine."; //note to self cus I forgot, return is used because you want to use it...
        }

        Motorcycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me()); //see here we are using the return
            String temp = super.define_me(); //super keyword is used
            System.out.println("My ancestor is a cycle who is " + temp);
        }
    }

