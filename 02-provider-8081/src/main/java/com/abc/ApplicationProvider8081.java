package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//如果是普通的spring boot应用需要注册到微服务注册中心需要加以下两种注解中的一种
//由于这是一个spring cloud应用(pom中有Eureka Client依赖), 所以不需要( -> 注释掉)
//@EnableEurekaClient		//仅限于Eureka注册中心
//@EnableDiscoveryClient  //可以是任意注册中心
@SpringBootApplication
public class ApplicationProvider8081 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationProvider8081.class, args);
	}

}
