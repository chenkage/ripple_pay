package com.ejar.common.permission;

import java.lang.annotation.*;

/**
 * 权限验证
 *
 * @author ChenXY
 * 
 */  
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthToken {
    String type() default "";
}