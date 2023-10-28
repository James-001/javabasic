package com.example.elastic.enumdemo;

public enum CodeEnum {

	UPDATE(101,"更新"), DELETE(102,"删除"), ADD(103,"增加");
	
	private int code;
	private String desc;
	
	CodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
