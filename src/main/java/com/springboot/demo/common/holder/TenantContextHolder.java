package com.springboot.demo.common.holder;

/**
 * 文 件 名:TenantContextHolder
 * 创 建 人:hackeridear
 * 创建日期:2018-05-25
 * 描   述:TenantContextHolder
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
public class TenantContextHolder {

    private static ThreadLocal<String> tenantThreadLocal = new ThreadLocal<>();

    public static final void setTenant(String scheme){
        tenantThreadLocal.set(scheme);
    }

    public static final String getTenant(){
        String scheme = tenantThreadLocal.get();
        return scheme == null ? "" : scheme;
    }

    public static final void remove(){
        tenantThreadLocal.remove();
    }
}
