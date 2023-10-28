package com.example.elastic.entity;

public class User {

	private int id;
	
	private String name;
	
	private String sex;
	
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", status=" + status + "]";
	}

	public User(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
