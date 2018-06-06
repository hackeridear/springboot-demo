package com.springboot.demo.controller;

import com.springboot.demo.entity.College;
import com.springboot.demo.entity.User;
import com.springboot.demo.service.ICollegeService;
import com.springboot.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 文 件 名:CollegeController
 * 创 建 人:hackeridear
 * 创建日期:2018-03-27
 * 描   述:CollegeController
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/user/list")
    public List<User> getCollegeList(){
        Long[] ids = {1L,2L};
        return iUserService.selectBatchIds(Arrays.asList(ids));
    }

    @GetMapping("/user")
    public User getCollege(){
        return iUserService.selectById(1);
    }

    @GetMapping("/user/add")
    public void addCollege(){
        User user = new User();
        user.setId(2L);
        user.setName("testa");
        user.setAge(100);
        iUserService.insert(user);
    }
}
