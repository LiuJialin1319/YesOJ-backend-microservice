package com.Yes.YesOJbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.Yes.YesOJbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.Yes")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.Yes.YesOJbackendserviceclient.service"})
public class YesOJBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesOJBackendQuestionServiceApplication.class, args);
    }

}
