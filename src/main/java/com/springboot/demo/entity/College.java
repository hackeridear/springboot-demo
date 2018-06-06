package com.springboot.demo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class College extends Model<College> {

    private static final long serialVersionUID = 1L;

    @TableId(value="id")
    //主键id
    private Long id;

    // 大学所在省市区域ID
    private Long areaId;

    // 大学所在省市区域名称
    private String areaName;

    // 大学名称
    private String name;

    // 大学类型
    private Integer type;

    // 大学类型名
    private String typeName;

    // 大学性质
    private Integer property;

    // 大学性质名
    private String propertyName;

    // 大学特色名
    private String tagName;

    // 院校层次
    private String level;

    // 院校排名
    private String ranking;

    // 隶属
    private String control;

    // LOGO图片Url
    private String logoUrl;

    // 官网Url
    private String siteUrl;

    // 爬取的大学编号
    private String oldNo;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
