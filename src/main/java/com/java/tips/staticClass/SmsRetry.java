package com.java.tips.staticClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yto on 2020/4/10.
 */
public class SmsRetry {
    public static final List tx = new ArrayList<String>();
    public static final List pdd = new ArrayList<String>();
    public static final List yto = new ArrayList<String>();

    static {
        tx.add("1");
        tx.add("2");
        tx.add("3");
        tx.add("4");
        tx.add("5");


        pdd.add("4000");
        pdd.add("400017");
        pdd.add("400019");
        pdd.add("5001");
        pdd.add("5002");
        pdd.add("5003");
        pdd.add("5004");
        pdd.add("5005");
        pdd.add("800001");

        yto.add("MS_999999");
        yto.add("MS_000001");
        yto.add("MS_000002");
        yto.add("MS_000006");
        yto.add("MS_000007");
        yto.add("MS_000008");
        yto.add("MS_000015");
        yto.add("MS_000016");
        yto.add("MS_000017");
        yto.add("MS_000018");
        yto.add("MS_000019");
        yto.add("MS_000020");
        yto.add("MS_000021");
        yto.add("MS_000022");
        yto.add("MS_000023");
    }

}
