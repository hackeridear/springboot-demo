package com.springboot.demo.interceptor;

import com.springboot.demo.common.holder.TenantContextHolder;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 文 件 名:TenantControlInteceper
 * 创 建 人:hackeridear
 * 创建日期:2018-05-25
 * 描   述:TenantControlInteceper
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
public class TenantControlInteceper implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        try {
            if ("login".equals(invocation.getMethod().getName())) {
                return invocation.proceed();
            }

            Object[] args = invocation.getArguments();
            String tenant = "";
            if (args != null && args.length > 0) {
                tenant = (String) args[0];
            }
            TenantContextHolder.setTenant(tenant);
            return invocation.proceed();
        }finally {
            TenantContextHolder.remove();
        }
    }
}
