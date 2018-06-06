package com.springboot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文 件 名:MyLogController
 * 创 建 人:hackeridear
 * 创建日期:2018-05-07
 * 描   述:MyLogController
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@RestController
@Slf4j
public class MyLogController {

    @GetMapping("/logs")
    public void log(){

        String name = "testName";
        String value = "testValue";
        log.trace("================trace log=================");
        log.debug("================debug log=================");
        log.info("=================info log==================");
        log.warn("=================warn log==================");
        log.error("=================error log==================");
        log.info("name:{};value:{}",name,value);
    }
}
