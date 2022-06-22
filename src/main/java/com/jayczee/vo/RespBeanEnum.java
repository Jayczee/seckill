package com.jayczee.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum RespBeanEnum {
    //通用状态码
    SUCCESS(200,"success"),
    ERROR(500,"服务端异常"),
    //登录模块5002xx
    SESSION_ERROR(500210,"SESSION不存在或已过期"),
    LOGINVO_ERROR(500211,"用户名或密码错误"),
    MOBILE_ERROR(500212,"手机号码格式错误");

    private final Integer code;
    private final String message;
}
