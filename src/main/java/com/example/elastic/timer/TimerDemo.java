package com.example.elastic.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

	public static void main(String[] args) {
		Timer t = new Timer();

		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				
				// 要执行的代码
				System.err.println("xxxxxxxxx");
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				long end = System.currentTimeMillis(); 
				System.err.println("xxxxxxxxx" + (end - start));
			}
		};

		// 以每24小时执行一次
		t.scheduleAtFixedRate(task, 1*1000, 2*1000);//1*1000 多久后开始执行task 2*1000每2次执行的间隔
	}
}
