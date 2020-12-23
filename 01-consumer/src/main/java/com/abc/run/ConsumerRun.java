package com.abc.run;

import com.abc.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerRun {
    public static void main(String[] args) throws IOException {
        // 创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");

        SomeService service = (SomeService) ac.getBean("someService");
        String hello = service.hello("China");
        System.out.println(hello);
    }
}
