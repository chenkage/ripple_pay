package com.ejar.persistence.syslog;

import java.lang.annotation.*;

/**
 * 系统级别的controller层自定义注解 
 * <br>拦截Controller 
 * @author ChenXY
 * 
 */  
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemControllerLog {
    String description() default "";
}