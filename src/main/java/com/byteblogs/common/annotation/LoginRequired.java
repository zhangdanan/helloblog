package com.byteblogs.common.annotation;

import com.byteblogs.system.enums.RoleEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target({ElementType.METHOD, ElementType.TYPE})
//Target决定这个注解可以加在哪些成分上，比如说类上，属性上，或者方法上
@Retention(RetentionPolicy.RUNTIME)
//决定LoginRequired注解的生命周期
public @interface LoginRequired {
    boolean required() default true;

    RoleEnum role() default RoleEnum.ADMIN;
}
