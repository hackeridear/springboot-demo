package com.springboot.demo.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 文 件 名:User
 * 创 建 人:hackeridear
 * 创建日期:2018-05-25
 * 描   述:User
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@Data
public class User {

    private Long id;

    private String name;

    private Integer age;
}
