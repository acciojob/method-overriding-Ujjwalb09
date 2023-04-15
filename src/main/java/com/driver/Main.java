package com.driver;

public class Main {
    public static void main(String[] args) {
        ClassB cb = new ClassB();

        String str = cb.meth(); //calling method of class A with class B object
        System.out.println(str);
    }
}