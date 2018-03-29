package com.zengs.dubbo.consumer;

import com.zengs.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        while (true){
            String hello = demoService.sayHello("world "+System.currentTimeMillis()); // 执行远程方法
            System.out.println( hello ); // 显示调用结果
            Thread.sleep(3000);
        }
    }
}
