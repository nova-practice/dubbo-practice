package com.quantum.dubbo.service.impl;


import com.quantum.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}