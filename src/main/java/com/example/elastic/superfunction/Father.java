package com.example.elastic.superfunction;

public class Father {
	
	public Father() {
		System.out.println("father");
	}
	
	public Father(String name) {
		this();
		System.out.println("father name is " + name);
	}
}
