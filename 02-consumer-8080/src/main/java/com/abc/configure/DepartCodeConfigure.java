package com.abc.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class DepartCodeConfigure {

    // 如果是一个Eureka Client 则必须加上负载均衡的注解
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){return new RestTemplate();}

}
