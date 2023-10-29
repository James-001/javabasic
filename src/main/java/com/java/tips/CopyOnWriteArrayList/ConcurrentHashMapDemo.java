package com.java.tips.CopyOnWriteArrayList;

import java.util.concurrent.ConcurrentHashMap;

/**  HashMap 和HashTable的区别：
 　　HashMap允许空值和空键；
 　　HashTable不允许空value,而且是线程安全的，synchronized

   下面这个是另外一个ConcurrentHashMap,hashtable是锁整张表，而这个是锁某个段。
   HashMap是线性非安全的，效率较线程安全的来时相对高。
 ConcurrentHashMap  不允许空键(key && value != null)值对
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap ch = new ConcurrentHashMap();
        ch.put("key","value");
    }
}
