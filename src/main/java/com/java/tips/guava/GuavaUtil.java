package com.java.tips.guava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.example.elastic.entity.User;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.java.tips.entity.User;
import org.apache.commons.lang3.StringUtils;

/*
 * goole的缓存使用
 */
public class GuavaUtil {

	public static void main(String [] args) throws ExecutionException, InterruptedException {
		//cacheLoading();
		User user = callBack();
		System.out.println(user.toString());
		System.out.println("======= sencond time  ==========");
		Thread.sleep(61*1000);
		
		System.out.println(user.toString());

		String fullAddress = StringUtils.defaultString(null).replace("中国", "");
		System.out.println("111111111--:"+fullAddress);
	}
	
	public static void cacheLoading() throws ExecutionException, InterruptedException {
		final List<User> list = new ArrayList<User>(5);
		list.add(new User("james1", "1"));
		list.add(new User("james2", "2"));
		list.add(new User("james3", "3"));
		list.add(new User("james4", "4"));
		list.add(new User("james5", "5"));
		
		LoadingCache<String, User> cache = CacheBuilder.newBuilder()
				.refreshAfterWrite(1, TimeUnit.MINUTES).maximumSize(10)//refreshAfterWrite:没有读写操作1分钟后过期
				.build(new CacheLoader<String, User>() {

					@Override
					public User load(String key) throws Exception {
						System.out.println("-------cache---key:" + key);
						User user = findUser(key);
						return user;
					}
					//假设查询数据库
					private User findUser(String key) {
						System.out.println("-------DB---key:" + key);
						for (User user: list) {
							if(user.getName().equals(key)) {
								return user;
							}
						}
						return null;
					}
				});
		User user = cache.get("james1");
		System.out.println(user.toString());
		System.out.println("-----second-------");
		//Thread.sleep(61*1000);
		User user2 = cache.get("james1");
		System.out.println(user2.toString());
	}
	
	public static User callBack() throws ExecutionException, InterruptedException {
		final List<User> list = new ArrayList<User>(5);
		list.add(new User("james1", "1"));
		list.add(new User("james2", "2"));
		list.add(new User("james3", "3"));
		list.add(new User("james4", "4"));
		list.add(new User("james5", "5"));
		
		final String key = "james1";
		
		Cache<String, User> cache = CacheBuilder.newBuilder().maximumSize(100).build();
		User user = cache.get(key, new Callable<User> () {

			@Override
			public User call() throws Exception {
				System.out.println("-------cache---key:" + key);
				User user = findUser(key);
				return user;
			}
			
			//假设查询数据库
			private User findUser(String key) {
				System.out.println("-------DB---key:" + key);
				for (User user: list) {
					if(user.getName().equals(key)) {
						return user;
					}
				}
				return null;
			}
		});
		return user;
	}
}
