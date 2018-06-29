package com.quantum.dubbo.consumer;

import com.quantum.dubbo.api.DemoService;
import com.quantum.dubbo.config.MyConf;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"});
        context.start();

        MyConf myConf = context.getBean(MyConf.class);

        myConf.show();

        // obtain proxy object for remote invocation
        DemoService demoService = (DemoService) context.getBean("demoService");
        // execute remote invocation
        String hello = demoService.sayHello("world");
        // show the result
        System.out.println(hello);
    }
}