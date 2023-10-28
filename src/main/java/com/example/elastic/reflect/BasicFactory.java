package com.example.elastic.reflect;

/**
 * 模拟spring IOC
 * Created by yto on 2018/12/11.
 */

import java.io.FileReader;
import java.util.Properties;

public class BasicFactory {
    public BasicFactory() {
    }

    private static Properties pro = null;

    static {
        pro = new Properties();
        try {
            //通过类加载器加载配置文件
            pro.load(new FileReader(BasicFactory.class.getClassLoader().
                    getResource("config.properties").getPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //使用泛型获得通用的对象
    public <T> T newInstance(Class<T> clazz) {
        System.out.println("配置文件: " + pro);
        String cName = clazz.getSimpleName();   //获得字节码对象的类名
        String pakageName = pro.getProperty(cName);   //根据字节码对象的类名通过配置文件获得类的全限定名
        System.out.println("class name:" + cName + ", package path:" + pakageName);
        try {
            return (T) Class.forName(pakageName).newInstance();   //根据类的全限定名创建实例对象
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}