package com.example.elastic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.elastic.entity.User;

public interface UserMapper {
	
	public List<User> findAll(@Param("shardingTotalCount") int shardingTotalCounts, @Param("shardingItem") int shardingItem);
	
	public void updateUser(User user);
}
