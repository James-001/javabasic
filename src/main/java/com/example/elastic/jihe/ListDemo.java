package com.example.elastic.jihe;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by yto on 2020/7/28.
 */
public class ListDemo {

    public static void main(String[] args) throws Exception {

        String str1 = "2020-07-28 18:08:08";
        String str2 = "2020-07-29 09:08:08";
        String str3 = "2020-07-28 10:08:08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//”yyyy/MM/dd HH:mm:ss”是我们传入的字符串日期格式
        Date d1 = sdf.parse(str1); //将时间字符串转换成日期对象
        Date d2 = sdf.parse(str2);
        Date d3 = sdf.parse(str3);

        List<OpDetail> list = new ArrayList<OpDetail>();

        OpDetail opDetail1 = new OpDetail();
        opDetail1.setCreateTime(d1);

        OpDetail opDetail2 = new OpDetail();
        opDetail2.setCreateTime(d2);

        OpDetail opDetail3 = new OpDetail();
        opDetail3.setCreateTime(d3);
        list.add(opDetail1);
        list.add(opDetail2);
        list.add(opDetail3);

        try{
            Collections.sort(list, new Comparator<OpDetail>() {
                @Override
                public int compare(OpDetail o1, OpDetail o2) {
                    long diffSeconds = getDiffSeconds(o1.getCreateTime(), o2.getCreateTime());
                    System.out.println((int) diffSeconds);
                    return (int) diffSeconds;
                }
            });
        }catch (Exception e) {
            e.printStackTrace();
        }

        for (OpDetail stu : list) {
            System.out.println("time:" + stu.getCreateTime());
        }
    }

    public static long getDiffSeconds(Date one, Date two) {
        Calendar sysDate = new GregorianCalendar();

        sysDate.setTime(one);

        Calendar failDate = new GregorianCalendar();

        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis()) / 1000;
    }
}
