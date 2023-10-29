package com.java.tips.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.zen.elasticjob.spring.boot.annotation.ElasticJobConfig;

//@ElasticJobConfig(cron = "0 0/1 * * * ?", shardingTotalCount = 2, shardingItemParameters = "0=a,1=b", startedTimeoutMilliseconds = 5000L, completedTimeoutMilliseconds = 10000L, description = "简单任务")
public class DemoSimpleJob implements SimpleJob {

	/**
	 *
	 * @param shardingContext
	 *            分片信息
	 */
	@Override
	public void execute(ShardingContext shardingContext) {
		// System.out.println("---" + shardingContext.toString() + "---");
		/*
		 * System.out.println(String.format("------Thread ID: %s, 任务总片数: %s, " +
		 * "当前分片项: %s.当前参数: %s," + "当前任务名称: %s.当前任务参数: %s",
		 * Thread.currentThread().getId(), shardingContext.getShardingTotalCount(),
		 * shardingContext.getShardingItem(), shardingContext.getShardingParameter(),
		 * shardingContext.getJobName(), shardingContext.getJobParameter()));
		 */
		for (int i = 0; i < 5; i++) {
			// System.out.println("---" + shardingContext.toString() + "---");
			int item = shardingContext.getShardingItem();
			// System.out.println("item---" + item + "---");
			if (i % 2 == item) {
				System.out.println("---" + i + "---");
			}
		}
	}
}
