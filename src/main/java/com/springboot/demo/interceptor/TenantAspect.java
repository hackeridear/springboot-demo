package com.springboot.demo.interceptor;

import com.springboot.demo.common.holder.TenantContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * 文 件 名:TenantAspect
 * 创 建 人:hackeridear
 * 创建日期:2018-05-25
 * 描   述:TenantAspect
 * 修 改 人:
 * 修改日期:
 * 版 本 号:v 1.0.0
 */
@Slf4j
@Aspect
@Component
public class TenantAspect {

    @Pointcut("execution( * com.springboot.demo.controller.*.*(..))")
    public void tenantPoint(){}

    @Before("tenantPoint()")
    public void doBefore(JoinPoint joinPoint){

        final ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        final HttpServletRequest request = requestAttributes.getRequest();

        // 记录下请求内容
        log.info("请求地址 : " + request.getRequestURL().toString());
        log.info("HTTP METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."+ joinPoint.getSignature().getName());
        log.info("参数 : " + Arrays.toString(joinPoint.getArgs()));

        if(!request.getServletPath().endsWith("login")){
            String tenant = request.getParameter("tenant");
            if(StringUtils.isNotBlank(tenant)){
                TenantContextHolder.setTenant(tenant);
                log.info("请求方法before,将tenant放入ThreadLocal中");
            }
        }
    }

    /**
     * returning的值和doAfterReturning的参数要一致
     * @param ret
     */
    @AfterReturning(returning = "ret",pointcut = "tenantPoint()")
    public void doAfterReturning(Object ret){
        log.info("返回值：" + ret);
        TenantContextHolder.remove();
    }

    @Around("tenantPoint()")
    public Object doAround(ProceedingJoinPoint pjp)throws Throwable{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object object = pjp.proceed();
        stopWatch.stop();
        log.info("耗时：" + stopWatch.getTime(TimeUnit.MILLISECONDS) + "毫秒");
        return object;
    }
}




























