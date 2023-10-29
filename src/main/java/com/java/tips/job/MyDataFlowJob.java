package com.java.tips.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.example.elastic.dao.UserMapper;
import com.example.elastic.entity.User;
import com.java.tips.dao.UserMapper;
import com.java.tips.entity.User;

import java.util.List;
import javax.annotation.Resource;

public class MyDataFlowJob implements DataflowJob<User> {
	
	@Resource
	private UserMapper userMapper;
 
    /*
        status
        0：待处理
        1：已处理
     */
    @Override
    public List<User> fetchData(ShardingContext shardingContext) {
    	int shardingTotalCount = shardingContext.getShardingTotalCount();
    	int shardingItem = shardingContext.getShardingItem();
    	System.out.println("fetchData start---shardingtotal: " + shardingTotalCount + " , currentSharding: " + shardingItem);
        
        /**
         * users = SELECT * FROM user WHERE status = 0 AND MOD(id, shardingTotalCount) = shardingItem Limit 0, 30
         */
        List<User> userList = userMapper.findAll(shardingTotalCount, shardingItem);
        
        for (User user : userList) {
        	System.out.println(user.toString() + "----currentSharding: " + shardingItem);
        }
        return userList;
    }
 
    @Override
    public void processData(ShardingContext shardingContext, List<User> data) {
    	System.out.println("------dataflow processData start----------");
        for (User user: data) {
            System.out.println(String.format("用户 %s 开始计息", user.getName()) + " : " + shardingContext.getShardingItem());
            /**
             * update user
             */
            user.setStatus(1);
            userMapper.updateUser(user);
        }
        /*try {
        	System.out.println("---------sleep-------");
			Thread.sleep(70*1000);//测试前一个任务没执行完的情况
			System.out.println("---------awake-------");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
    }
}
