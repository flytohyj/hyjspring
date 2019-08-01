package com.main.hyj.springmvc.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HyjRequestParam {
    String value() default "";
}
