package com.java.tips.enumdemo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author James-Yin
 */
public class Result {
    
	@JsonProperty(value = "resultCode")
    private int resultCode;
    
    @JsonProperty(value = "errMsg")
    private String errMsg;
    
    private Object data;
    
    public Result(int resultCode, Object data) {
        this.resultCode = resultCode;
        this.data = data;
    }

    public Result(int resultCode, String errMsg, Object data) {
        this.resultCode = resultCode;
        this.errMsg = errMsg;
        this.data = data;
    }
    
    public Result(int code, String errMsg) {
		this.resultCode = code;
		this.errMsg = errMsg;
	}


    public Result(CodeEnum resultCode, Object data) {
        this.resultCode = resultCode.getCode();
        this.errMsg = resultCode.getDesc();
        this.data = data;
    }
    
    public Result(CodeEnum codeEnum) {
		this.resultCode = codeEnum.getCode();
		this.errMsg = codeEnum.getDesc();
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [resultCode=" + resultCode + ", errMsg=" + errMsg + ", data=" + data + "]";
	}
}

