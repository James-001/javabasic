package com.example.elastic.exception;

import java.math.BigDecimal;

/**
 * Created by yto on 2019/1/24.
 */
public class ExceptionDeal {

    public Dog add () {
        Dog dog = new Dog();
        dog.setWoshi(3d);
        dog.setNishi(3.01d);
        return dog;
    }

    public static void main(String [] args) {

        if(AuxOpCodeEnum.isExist("new")) {
            System.out.println("YES");
        } else {
            System.out.println("noss");
        }


        BigDecimal feeAmount = new BigDecimal(0);
        BigDecimal coupon = new BigDecimal(0);

        ExceptionDeal hhh = new ExceptionDeal();
        Dog dog = hhh.add();
        coupon = BigDecimal.valueOf(dog.getWoshi());
        feeAmount = BigDecimal.valueOf(dog.getNishi());
        feeAmount = feeAmount.subtract(coupon);
        System.out.println(feeAmount);

    }

    public static  boolean isMailNoForBOnLine(String mailNo){
        if(mailNo.toUpperCase().startsWith("DB")||
                mailNo.toUpperCase().startsWith("B9")||
                mailNo.toUpperCase().startsWith("99") || (mailNo.startsWith("8") && (mailNo.length() == 12))){
            return true;
        }
        return false;
    }

    public int son(){
        int x = 10;
        try {
            System.out.println("------开始处理业务代码----");
            x = 1/0;
        } catch (Exception e) {
            System.out.println("-------捕获到异常，抛出异常----");
            throw new IllegalArgumentException("分母为空！");//jvm结束，否则只是捕获到异常，代码继续执行
        }
        System.out.println("-------无异常----");
        return x;
    }

    public class Dog {
        Double woshi;
        Double nishi;
        public Double getWoshi() {
            return woshi;
        }

        public void setWoshi(Double woshi) {
            this.woshi = woshi;
        }

        public Double getNishi() {
            return nishi;
        }

        public void setNishi(Double nishi) {
            this.nishi = nishi;
        }
    }
}