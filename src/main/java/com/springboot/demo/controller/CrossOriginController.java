package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@RestController
public class CrossOriginController {

    @Value("${server.port}")
    private int port;

    @Value("${server.servlet.path}")
    private String path;

    //@CrossOrigin("http://localhost:8082")
    @RequestMapping("/config")
    public String getProperties(){
        return "path:" + path + "--port:" + port + "!";
    }
    
}
