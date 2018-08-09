package com.liuguofa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guofa.liu@kingtroldata.com
 * @description
 * @create 2018/8/7 11:41
 */


@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
