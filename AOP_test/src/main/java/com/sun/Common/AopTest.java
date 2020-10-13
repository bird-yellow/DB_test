package com.sun.Common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTest {

        @Pointcut("execution(*  com.sun.Test2.*.*(..))")
        public void pointCut(){}

        @Before("pointCut()")
        public void before(){
            System.out.println("开始");
        }


        @After("pointCut()")
        public void after(){
            System.out.println("结束");
        }
}
