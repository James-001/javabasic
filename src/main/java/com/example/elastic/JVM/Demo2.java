package com.example.elastic.JVM;

/**
 * Created by yto on 2019/10/15.
 */
public class Demo2 {

    public static void main(String[] args) {
        /*
        str1 和 str2 都在栈中，
         */
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("str1==str2 : " + (str1 == str2));

        String str3 = new String("abc");

        String str4 = new String("abc");
        System.out.println("str1==str3 : " + (str1 == str3));

        System.out.println("str3==str4 : " + (str3 == str4));
    }
}
