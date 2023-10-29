package com.java.tips.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yto on 2019/10/11.
 */
public class Jihe<E> {

    public List<E> save (E data) {
        List<E> list = new ArrayList<E>();
        list.add(data);
        return list;
    }


    public List save2 (E e) {
        List<E> list = new ArrayList<E>();
        list.add(e);
        return list;
    }

    public void save3 (E e) {
        List<E> list = new ArrayList<E>();
        list.add(e);
    }
}
