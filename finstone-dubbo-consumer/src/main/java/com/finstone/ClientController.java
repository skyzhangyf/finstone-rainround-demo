package com.finstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangyf
 * @description
 * @date 2019/4/23/023
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/dubbo")
public class ClientController {
    @Resource
    //@Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String say(){
        System.out.println("===============");
        return testService.sayHello("success");
    }
}
