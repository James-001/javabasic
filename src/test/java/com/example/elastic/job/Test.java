package com.example.elastic.job;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        System.out.println(isNumberic("123456我123a"));
        System.out.println(isChar("123456123我a"));
        System.out.println(isChinese("1234561我23a"));
    }

    public static boolean isNumberic(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    //是否有字母
    public static boolean isChar(String fstrData) {
        char[] cs = fstrData.toCharArray();
        boolean flag = false;
        for (char c : cs) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    //是否有汉字
    public static boolean isChinese(String str) {
        String regEx = "[\u4e00-\u9fa5]";
        Pattern pat = Pattern.compile(regEx);
        Matcher matcher = pat.matcher(str);
        boolean flg = false;
        if (matcher.find())
            flg = true;
        return flg;
    }
}
