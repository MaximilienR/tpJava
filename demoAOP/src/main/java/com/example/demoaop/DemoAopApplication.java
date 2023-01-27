package com.example.demoaop;

import com.example.demoaop.service.DoSomethingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAopApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext context= SpringApplication.run(DemoAopApplication.class, args);
        DoSomethingService doSomethingService= context.getBean(DoSomethingService.class);

        System.out.println("Main : "+doSomethingService.doSomething());
    }

}
