package com.springboot.demo.config.res;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 文 件 名:MyWebAppConfig
 * 创 建 人:hackeridear
 * 创建日期:2018-03-26
 * 描   述:MyWebAppConfig 通过这种方式可以修改静态文件的路径
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@Configuration
public class MyWebAppConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/mystatic/*").addResourceLocations("classpath:/mystatic/");
//        registry.addResourceHandler("/*").addResourceLocations("file:/Users/hackeridear/Documents/img/");

    }
}
