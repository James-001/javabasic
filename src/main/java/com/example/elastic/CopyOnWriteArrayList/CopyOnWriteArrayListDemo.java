package com.example.elastic.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//CopyOnWriteArrayList 写的时候分离

/*
	详解见：readme.md
 */
public class CopyOnWriteArrayListDemo {

	//private List<String> mList = new ArrayList<String>();
	private List<String> mList = new CopyOnWriteArrayList<String>();

	public static void main(String args[]) {
		new CopyOnWriteArrayListDemo().start();
	}

	private void initData() {
		for (int i = 0; i <= 21; i++) {
			System.out.println(Thread.currentThread().getName() + " : save list " + (i + 1) + " ......");
			this.mList.add("save list " + (i + 1) + " ......");
		}
	}

	private void start() {
		initData();
		ExecutorService service = Executors.newFixedThreadPool(21);
		for (int i = 0; i < 21; i++) {
			service.execute(new ListReader(this.mList));//读取
			service.execute(new ListWriter(this.mList, i));//写入
		}
		service.shutdown();
	}

	private class ListReader implements Runnable {
		private List<String> mList;

		public ListReader(List<String> list) {
			this.mList = list;
		}

		@Override
		public void run() {
			if (this.mList != null) {
				for (String str : this.mList) {
					System.out.println("read : " + Thread.currentThread().getName() + " : " + str);
				}
			}
		}
	}

	private class ListWriter implements Runnable {
		private List<String> mList;
		private int mIndex;

		public ListWriter(List<String> list, int index) {
			this.mList = list;
			this.mIndex = index;
		}

		@Override
		public void run() {
			if (this.mList != null) {
				System.out.println("writer : " + mIndex + " ......");
				this.mList.add("writer: " + mIndex + " ......");
			}
		}
	}
}