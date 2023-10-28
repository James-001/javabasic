package com.example.elastic.annotation;


/**
 * Created by yto on 2020/10/28.
 */
public class Template {

    @AnnotationDemo
    static String name;

    public static void main(String[] args) {
        name = new Template().getClass().getDeclaredFields()[0].getAnnotation(AnnotationDemo.class).name();
        System.out.println(name);
    }




}
