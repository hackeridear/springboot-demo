package com.springboot.demo.config.custom;

import com.springboot.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文 件 名:MyBean
 * 创 建 人:hackeridear
 * 创建日期:2018-06-05
 * 描   述:MyBean
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@Configuration
public class MyBean {

    @Bean(name = "user")
    public User getUser(){
        User user = new User();
        user.setAge(22);
        user.setId(10000L);
        user.setName("testUser1");
        return user;
    }
}
