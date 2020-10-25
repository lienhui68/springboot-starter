package com.eh.ehtestspringbootstarer.controller;

import com.eh.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    /**
     * 测试：http://localhost:8080/
     * 结果：EHPrefix-davidEHSuffix
     * @return
     */
    @GetMapping("/")
    public String sayHello() {
        return helloService.sayHello("david");
    }
}
