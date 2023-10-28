package com.example.elastic.superfunction;

public class Son extends Father{

	public Son() {
		super("old man");//指定了有参构造函数时，就不会调用父类的无参构造函数了，否则无论显示的写super()都会调用父类的无参构造函数
		System.out.println("son");
	}
}
