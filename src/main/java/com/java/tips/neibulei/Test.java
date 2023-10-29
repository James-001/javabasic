package com.java.tips.neibulei;

import com.alibaba.fastjson.JSON;

import java.text.MessageFormat;
import java.util.UUID;

/**
 * Created by yto on 2020/1/16.
 */
public class Test {
    public static void main(String[] arg) {

        int max = 10000, min = 1000;
        int nonce = (int) (Math.random() * (max - min) + min);

        String validCode = "STATION_VALID_CODE_";

        String message = "【妈妈驿站】验证码：%s，15分钟内输入有效，请妥善保存！";
        String content = String.format(message,nonce);

        System.out.println(content);
    }
}
