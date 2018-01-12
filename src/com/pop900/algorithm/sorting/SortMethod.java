package com.pop900.algorithm.sorting;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by michael on 17-9-3.
 */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
public @interface SortMethod {
    String what() default "Basketball";
}
