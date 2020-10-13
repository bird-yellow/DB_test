package com.sun.Common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

        @Pointcut("@annotation(com.sun.Common.LogAnno)")
        public void AnnotationCut(){}



        @Before("AnnotationCut()")
        public void before(){
            System.out.println("开始");
        }

        @After("AnnotationCut()")
        public void after(){
            System.out.println("结束");
        }
}
