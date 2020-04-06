package com.spring.demoteststart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class DemoteststartApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    //如果在这里将throw Exception去掉的话,使用mvn启动的话,会报错,无法正常启动
    public static void main(String[] args) throws Exception{
        SpringApplication.run(DemoteststartApplication.class, args);
    }

}
