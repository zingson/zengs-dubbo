package com.zengs.dubbo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.zengs.dubbo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
