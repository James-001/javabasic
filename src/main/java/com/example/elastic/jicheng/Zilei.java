package com.example.elastic.jicheng;

import org.apache.commons.lang3.StringUtils;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Zilei extends Fulei {

    public static void main(String[] args) throws Exception {

        Car car1 = new Car();
        car1.setName("car1");
        car1.setAge("a1");
        car1.setSex("sex1");
        Car car2 = new Car();
        car2.setName("car2");
        car2.setAge("a2");
        car2.setSex("sex2");
        Car car3 = new Car();
        car3.setName("car3");
        car3.setAge("a3");
        car3.setSex("sex3");
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        List<Car> list1 = list.stream().filter(respDto -> (respDto.getSex() == "sex2")
                || (respDto.getSex() == "sex3")).collect(Collectors.toList());

        list1.parallelStream().forEach(car -> {
            System.out.println(car.getName() + ":" + car.getAge());
        });

        List<Car> list2 = list.stream().sorted(Comparator.comparing(Car::getAge)).collect(Collectors.toList());

        System.out.println("********************");
        list2.parallelStream().forEach(car -> {
            System.out.println(car.getName() + ":" + car.getAge());
        });


        String a = "123.3495776";
        int i = a.indexOf(".");
        System.out.println(a.substring(0, i+3));

    }

}
