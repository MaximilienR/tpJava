package com.example.demoaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Before("execution(public *com.exemple.demo.aop.services.*Service.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("(Before) appl de %s avec %d parametres %n");
        joinPoint.toShortString(),joinPoint.getArgs())
    }
}
