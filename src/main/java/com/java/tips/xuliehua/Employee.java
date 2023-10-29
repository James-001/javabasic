package com.java.tips.xuliehua;

import java.io.Serializable;

/**
 * Created by yto on 2018/12/12.
 */
public class Employee implements Serializable{
    private static final long serialVersionUID = 3238894774841125195L;
    private String name ;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
