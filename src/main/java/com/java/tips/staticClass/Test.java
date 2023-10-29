package com.java.tips.staticClass;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by yto on 2020/4/15.
 */
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Map<String, Integer> failItem = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            String createTime = DateUtils.addDay(new Date(), -i);
            failItem.put(createTime, 0);
        }
        List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(failItem.entrySet());

        // 对HashMap中的key 进行排序
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getKey()).toString().compareTo(o2.getKey().toString());
            }
        });

        // 对HashMap中的key 进行排序后 显示排序结果
        // 注意这里输出的是List 的对象 infoIds
        for (int i = 0; i < infoIds.size(); i++) {
            String id = infoIds.get(i).toString();
            System.out.println(id);
        }System.out.println();


        // 对HashMap中的 value 进行排序
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).toString().compareTo(o2.getValue().toString());
            }
        });

        // 对HashMap中的 value 进行排序后  显示排序结果
        for (int i = 0; i < infoIds.size(); i++) {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  ");
        }
    }
}



