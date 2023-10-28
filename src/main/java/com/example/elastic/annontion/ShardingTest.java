package com.example.elastic.annontion;

//@Sharding 放到此处会报错，因为@Target is method
public class ShardingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShardingTest shardingTest = new ShardingTest();
		shardingTest.add();
	}
	
	@Sharding
	public void add () {
		System.out.println("add");
	}

}
