package com.lsm.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lsm.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/show")
    @ResponseBody
    public String sayhello(String name){
        String sayhello = helloService.sayhello(name);
        System.out.println(sayhello);
        return sayhello;
    }
}
