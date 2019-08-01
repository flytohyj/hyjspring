package com.main.hyj.springmvc.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HyjAutowired {
    String value() default "";
}
