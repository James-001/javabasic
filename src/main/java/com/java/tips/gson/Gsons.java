package com.java.tips.gson;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Gsons {
	
    private static Gson gson = new GsonBuilder()
            .enableComplexMapKeySerialization()                         //支持Map的key为复杂对象的形式
            .setDateFormat("yyyy-MM-dd HH:mm:ss")                       //时间转化为特定格式
            .setVersion(1.0)                                            //有的字段不是一开始就有的,会随着版本的升级添加进来,那么在进行序列化和返序列化的时候就会根据版本号来选择是否要序列化.
            .create();
	
	public static void main(String[] args) {
		String jsonData = "[{\"address\":\"\",\"age\":11,\"name\":\"wade\"},{\"address\":\"shanghai\",\"age\":12,\"name\":\"james\"}]";
		List<Person> people = gson.fromJson(jsonData, new TypeToken<List<Person>>(){}.getType());
		for(Person per: people) {
			System.out.println(per);
		}
		
		String jsonData2 = "{\"age\":11,\"name\":\"wade\"}";//少一个参数可以的
		Person people2 = gson.fromJson(jsonData2, Person.class);
		System.out.println(people2);

		System.out.println("aaaa22" + toJsons(null));
	}

	public static String toJsons(Object obj){
		System.out.println("11111");
		return gson.toJson(obj);


	}
}

