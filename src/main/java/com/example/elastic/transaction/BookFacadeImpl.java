package com.example.elastic.transaction;

public class BookFacadeImpl implements BookFacade {
	@Transaction
	public void addBook() {
		query();
		System.out.println("增加图书方法。。。");
	}
	
	public void query() {
		System.out.println("查询是否可以增加图书");
	}

}