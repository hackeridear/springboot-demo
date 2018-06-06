package com.springboot.demo.config.database;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass=true)
//@EnableTransactionManagement
//@EnableConfigurationProperties(ShardingMastSlaveConfig.class)
@Slf4j
public class DataSourceConfig {

    /*@Bean(name="dataSource")
    public DataSource daoDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("chenjingxue");
        //重点是这一行
        dataSource.setJdbcUrl("jdbc:mysql://localhost:8066/tenant1?useUnicode=true&characterEncoding=UTF-8");

        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }*/

    //@Autowired
    //private ShardingMastSlaveConfig shardingMastSlaveConfig;

//    @Bean(name = "db1")
//    @ConfigurationProperties(prefix = "spring.datasource.ds1")
//    public DataSource db1(){
//        return DataSourceBuilder.create().type(HikariDataSource.class).build();
//    }
//
//    @Bean(name = "db2")
//    @ConfigurationProperties(prefix = "spring.datasource.ds2")
//    public DataSource db2(){
//        return DataSourceBuilder.create().type(HikariDataSource.class).build();
//    }


//    @Bean
//    public ShardingRuleConfiguration shardingRule(){
//        // 配置Order表规则
//        TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
//        orderTableRuleConfig.setLogicTable("t_order");
//        orderTableRuleConfig.setActualDataNodes("db${0..1}.t_order_${0..1}");
//        // 配置分库策略（Groovy表达式配置db规则）
//        orderTableRuleConfig.setDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("user_id", "db${user_id % 3}"));
//        // 配置分表策略（Groovy表达式配置表路由规则）
//        orderTableRuleConfig.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("order_id", "t_order_${order_id % 2}"));
//        // 配置分片规则
//        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
//        shardingRuleConfig.getTableRuleConfigs().add(orderTableRuleConfig);
//        return shardingRuleConfig;
//    }

//    @Bean(name="dataSource")
//    public DataSource shardingDataSource() throws SQLException {
//        shardingMastSlaveConfig.getDataSources().forEach((k, v) -> configDataSource(v));
//        Map<String, DataSource> dataSourceMap = Maps.newHashMap();
//        dataSourceMap.putAll(shardingMastSlaveConfig.getDataSources());
//        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(dataSourceMap, shardingMastSlaveConfig.getMasterSlaveRule(), Maps.newHashMap());
//        log.info("masterSlaveDataSource config complete");
//        return dataSource;
//    }
//
//    private void configDataSource(HikariDataSource hikariDataSource){
//        hikariDataSource.setConnectionTimeout(30000);
//    }

}  