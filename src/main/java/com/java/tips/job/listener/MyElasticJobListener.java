package com.java.tips.job.listener;

import org.springframework.stereotype.Component;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

@Component
public class MyElasticJobListener implements ElasticJobListener {
    
    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        System.out.println("------job start------");
    }
    
    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
    	System.out.println("------job finished------");
    }
}
