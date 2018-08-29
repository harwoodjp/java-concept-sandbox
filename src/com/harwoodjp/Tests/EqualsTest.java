package com.harwoodjp.Tests;

public class EqualsTest {
    public static void run() {
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        System.out.println(string1 == string2);       // false, different memory locations
        System.out.println(string1.equals(string2));  // true, same value

        String nullStr = null;
        //System.out.println(nullStr.equals(null));   // NullPointerException
        System.out.println(nullStr == null);


    }
}
