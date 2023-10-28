package com.example.elastic.enumdemo;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int str = CodeEnum.DELETE.getCode();
		String desc = CodeEnum.DELETE.getDesc();
		/*CodeEnum[] ss = CodeEnum.values();
		System.out.println(ss[0].getDesc());*/
		CodeEnum enums = CodeEnum.ADD;
		System.out.println(str + ":" + desc);
		System.out.println(enums);
		
		Result resule = new Result(CodeEnum.DELETE, "nihao");
		//System.out.println(resule);
		System.out.println(new ApiException(CodeEnum.ADD).getResult());
		throw new ApiException(CodeEnum.ADD);
	}

}
