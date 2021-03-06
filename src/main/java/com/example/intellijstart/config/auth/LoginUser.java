package com.example.intellijstart.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //어노테이션 생성위치 정의
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser { //@interface 어노테이션 클래스로 지정
}
