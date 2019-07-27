package com.lsm.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lsm.service.HelloService;
import org.springframework.transaction.annotation.Transactional;


@Service(interfaceClass = HelloService.class)
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayhello(String name) {
        System.out.println("hello" + name);
        return "service被访问了"+name;
    }
}
