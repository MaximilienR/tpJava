package com.example.tp_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public String com.example.tp_aop.services.*Service.diSendMailService*(..))")
    public  void SendMail(){
        System.out.println("jusque la tout va bien");
    }

    private  final Logger logger = LoggerFactory.getLogger()
}
