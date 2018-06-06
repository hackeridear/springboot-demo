package com.springboot.demo.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTestSimpleJob implements SimpleJob {
    public void execute(ShardingContext shardingContext) {
        log.info(String.format("------Thread ID: %s, 任务总片数: %s, 当前分片项: %s",
                               Thread.currentThread().getId(),
                               shardingContext.getShardingTotalCount(),
                               shardingContext.getShardingItem()));
    }
}
