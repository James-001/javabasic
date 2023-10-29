package com.java.tips.dao;

import java.util.List;

import com.java.tips.entity.User;
import org.apache.ibatis.annotations.Param;

import com.example.elastic.entity.User;

public interface UserMapper {
	
	public List<User> findAll(@Param("shardingTotalCount") int shardingTotalCounts, @Param("shardingItem") int shardingItem);
	
	public void updateUser(User user);
}
