package com.java.tips.dao;

import com.java.tips.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	
	public List<User> findAll(@Param("shardingTotalCount") int shardingTotalCounts, @Param("shardingItem") int shardingItem);
	
	public void updateUser(User user);
}
