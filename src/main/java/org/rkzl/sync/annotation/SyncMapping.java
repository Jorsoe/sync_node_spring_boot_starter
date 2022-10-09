package org.rkzl.sync.annotation;

import java.lang.annotation.*;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 12:44
 * @Description: Annotate For Sync Mapping
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SyncMapping {

    boolean enable() default true;

    String source() default "";

    String dest() default "";
}
