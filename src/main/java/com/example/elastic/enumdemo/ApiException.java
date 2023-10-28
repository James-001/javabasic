package com.example.elastic.enumdemo;

public class ApiException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Result result;
	
	public ApiException(CodeEnum codeEnum) {
		super(codeEnum.getDesc());//调用父类的构造函数
		this.result = new Result(codeEnum);
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
