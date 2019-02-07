package com.psl.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value=ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestThis {

	public String name() default "<no-name>"; //this is an attribute from annotation point of  view

}
