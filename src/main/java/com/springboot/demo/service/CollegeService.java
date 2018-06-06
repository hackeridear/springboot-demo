package com.springboot.demo.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.springboot.demo.entity.College;
import com.springboot.demo.mapper.CollegeMapper;
import org.springframework.stereotype.Service;


/**
 * 文 件 名:CollegeService
 * 创 建 人:hackeridear
 * 创建日期:2018-03-27
 * 描   述:CollegeService
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
//@Service
public class CollegeService extends ServiceImpl<CollegeMapper,College> implements ICollegeService{

}
