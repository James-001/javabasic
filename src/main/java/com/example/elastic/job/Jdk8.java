package com.example.elastic.job;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Jdk8 {
	
	private static List<Integer> list2 = new ArrayList<>();
	private static List<Integer> list3 = new ArrayList<>();
	private static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		//filterDemo();
		
		//hashDemo();

		List<String> allUserId = new ArrayList<>();
		allUserId.add("1001");
		allUserId.add("1002");
		allUserId.add("1003");
		allUserId.add("1004");
		allUserId.add("1005");
		allUserId.add("1006");
		allUserId.add("1007");
		allUserId.add("1008");
		allUserId.add("1009");
		allUserId.add("1010");
		allUserId.add("1011");
		allUserId.add("1012");
		allUserId.add("1013");
		allUserId.add("1014");
		allUserId.add("1015");
		allUserId.add("1016");
		allUserId.add("1017");

		List<String> allUserIdResult = new ArrayList<>();
		String resutltList = "";
		for (int i=0;i<allUserId.size();i++) {//每5个一打包，减少数据库连接操作
			if ((i+1) % 5 == 0 || (i==allUserId.size()-1)) {
				resutltList += allUserId.get(i);
				allUserIdResult.add(resutltList);
				resutltList = "";
			} else {
				resutltList += allUserId.get(i);
				resutltList += " or userId = ";
			}
		}
		System.out.println(allUserIdResult.toString());
	}

	private static void hashDemo() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		Integer[] packets = set.parallelStream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer mqPacket) {
                if (mqPacket != null) {
                    return true;
                }
                return false;
            }
        }).toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
		
		for (Integer integer : packets) {
			System.out.println(integer);
		}
	}

	private static void filterDemo() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.forEach(System.out::println);
		System.out.println("-------------------");
		list1.stream().filter(n -> (n > 3)).forEach(System.out::println);
	}

}
