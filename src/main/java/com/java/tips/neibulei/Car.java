package com.java.tips.neibulei;

/**
 * Created by yto on 2020/1/16.
 */
public class Car {
    private String name;
    public String age;

    public String add(String name, String age) {
        return name + age;
    }

    public String baDao(String name) {
        BaDao baDao = new BaDao();
        return baDao.addNeiGong(name);
    }

    public String fengTian(String name) {
        Fengtian baDao = new Fengtian();
        return baDao.addNeiSi(name);
    }

    private class Fengtian {
        private String james;

        public String addNeiSi(String james) {
            return james + ": si";
        }
    };

    public class BaDao {
        public void BaDao(String wade){}
        private String wade;

        public String addNeiGong(String wade) {
            return wade + ": gong";
        }
    };
}
