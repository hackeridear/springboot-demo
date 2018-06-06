package com.springboot.demo.config.res;

/**
 * 自定义身份验证类（用于重写WebSecurityConfigurerAdapter默认配置）
 * @Configuration     表示这是一个配置类
 * @EnableWebSecurity    允许security
 * configure()     该方法重写了父类的方法，用于添加用户与角色
 * */
//@Configuration
//@EnableWebSecurity
public class AuthConfig{ /*extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http.requestMatcher(EndpointRequest.toAnyEndpoint()).anonymous();
        // @formatter:on
    }*/


}