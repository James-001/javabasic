package com.example.elastic.fanxing.jiekou;

/**
 * Created by yto on 2019/10/11.
 */
public class TestDemo {

    public static void main(String[] args) throws Exception {
        SmallCar smallCar = new SmallCar();
        smallCar.setAge("james");
        add(SmallCar.class, smallCar);
    }

    public static <T> void add(Class<T> clzss, Object o) throws Exception {
        T value = null;
        try {
            value = clzss.newInstance();//创建一个对象
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (value instanceof SmallCar) {
            System.out.println("******************string******************");
            SmallCar smallCar = (SmallCar) o;
            System.out.println(smallCar.getAge());
            throw new Exception("asdasds");
        }
    }

    public static void add2(Class clzss) {
        Object object = null;
        try {
            object = clzss.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (object instanceof String) {
            System.out.println("******************string******************");
        }
    }


    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
