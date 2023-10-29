package com.java.tips.superfunction;

public class Father {
	
	public Father() {
		System.out.println("father");
	}
	
	public Father(String name) {
		this();
		System.out.println("father name is " + name);
	}
}
