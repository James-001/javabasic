package com.java.tips.reflect.reflect2;

/**
 * 反射 实例1
 * Created by yto on 2018/12/11.
 */
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception {

        //1.通过反射获取类
        Class fruit = Fruit.class;

        //2.通过反射类 创建对象
        Fruit fruitShiLi = (Fruit) fruit.newInstance();
        System.out.println("----1111---");

        //3.调用方法
        Method method = fruit.getMethod("show");
        method.invoke(fruitShiLi);
    }
}

class Fruit{
    public Fruit () {
        System.out.println("--Constructor----");
    }
    public void show(){
        System.out.println("--show----");
    }


}
