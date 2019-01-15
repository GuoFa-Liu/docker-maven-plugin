package com.liuguofa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

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

    @Autowired
    private Environment env;

    @RequestMapping("/env")
    public String hello(){
        return Arrays.toString(env.getActiveProfiles());
    }
}
