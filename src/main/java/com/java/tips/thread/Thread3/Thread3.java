package com.java.tips.thread.Thread3;

import java.util.Scanner;

/**
 * Created by yto on 2020/12/15.
 */
public class Thread3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            jiexi(str);
        }
    }

    public static void jiexi(String str) {
        String teshu = "\"";
        String[] arrys = str.split(" ");
        int total = 0;
        String ss = "";
        for (int i = 0; i < arrys.length; i++) {
            if (arrys[i].contains(teshu)) {
                if (arrys[i - 1].contains(teshu)) {
                    total++;
                } else {
                    continue;
                }
            } else {
                total++;
            }
        }
        System.out.println(total);
        for (int i = 0; i < arrys.length; i++) {
            if (arrys[i].contains(teshu)) {
                if (arrys[i - 1].contains(teshu)) {
                    ss += arrys[i].replace(teshu, "");
                    System.out.println(ss);
                    total++;
                    ss = "";
                } else {
                    ss += arrys[i].replace(teshu, "");
                    ss += " ";
                    continue;
                }
            } else {
                System.out.println(arrys[i]);
                total++;
                ss = "";
            }
        }

    }
}
