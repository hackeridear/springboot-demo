package com.springboot.demo.common.error;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;

/**
 * 主要用途：存储错误信息的Bean.
 * 设计说明：
 * 1.官方提供了默认错误存储{@link DefaultErrorAttributes},但其最终返回的是存储结构是Map<String,Object>。
 * 2.为了避免采用Map这种模糊的数据结构,故统一使用{@link ErrorInfo}来表示错误信息。
 * 3.作为存储Bean,最好不要耦合业务逻辑,故统一使用{@link ErrorInfoBuilder}来构建错误信息.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ErrorInfo {
    /**
     * 发生时间
     */
    private String time;
    /**
     * 访问Url
     */
    private String url;
    /**
     * 错误类型
     */
    private String error;
    /**
     * 错误的堆栈轨迹
     */
    String stackTrace;
    /**
     * 状态码
     */
    private int statusCode;
    /**
     * 状态码-描述
     */
    private String reasonPhrase;

}