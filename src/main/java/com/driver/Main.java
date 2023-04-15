package com.driver;

import java.io.*;
import java.lang.*;
import java.util.*;





public class Main
{

    public static class A
    {

        public String meth ()
        {
            return "Invoking method from class A";
        }

    }

    public static class B extends A {

        public String meth ()
        {
            return "Method is overridden in Extendend class B";
        }


    }
    public static void main (String[]args)
    {
        System.out.println (new B().meth ());
    }
}