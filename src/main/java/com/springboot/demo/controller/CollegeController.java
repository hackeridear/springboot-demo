package com.springboot.demo.controller;

import com.springboot.demo.entity.College;
import com.springboot.demo.service.ICollegeService;
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
public class CollegeController {

    /*@Autowired
    private ICollegeService iCollegeService;

    @GetMapping("/college/list")
    public List<College> getCollegeList(){
        Long[] ids = {1L};
        return iCollegeService.selectBatchIds(Arrays.asList(ids));
    }

    @GetMapping("/college")
    public College getCollege(){
        return iCollegeService.selectById(1);
    }

    @GetMapping("/college/add")
    public void addCollege(){
        College college = new College();
        college.setAreaId(2L);
        college.setAreaName("测试");
        college.setName("测试");
        college.setType(1);
        college.setTypeName("测试");
        college.setPropertyName("测试");

        iCollegeService.insert(college);
    }*/
}
