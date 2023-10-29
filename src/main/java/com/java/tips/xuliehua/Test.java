package com.java.tips.xuliehua;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yto on 2018/12/12.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //第一步：序列化
        //xuliehua();

        //第二步：反序列化
        //fanxuliehua();
        Employee emp = new Employee();


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("asd",emp);
        System.out.println("asd[asdas]".replace("[","").replace("]","").replace("{","").replace("}",""));

        System.out.println(timeStamp2Date("1586855000000",""));

    }

    public static String timeStamp2Date(String seconds,String format) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        if(format == null || format.isEmpty()){

        }
        String sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(Long.valueOf(seconds)));
        return sdf;
    }

    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }

    public static void xuliehua() throws Exception {
        Employee emp = new Employee();

        //emp.setName("name");
        emp.setSex("13");
        FileOutputStream fileOut = new FileOutputStream("emp.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(emp);
        out.close();
        fileOut.close();
        System.out.printf("Serialized data is saved in /employee.ser");
    }

    public static void fanxuliehua() throws Exception {
        FileInputStream fileIn;

        fileIn = new FileInputStream("emp.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employee emp = (Employee) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Deserialized Employee...");

        //System.out.println("age:" + emp.getAge());
    }
}
