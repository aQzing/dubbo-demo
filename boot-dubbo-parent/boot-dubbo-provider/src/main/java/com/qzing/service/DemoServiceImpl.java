package com.qzing.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author qzing
 * @ClassName: DemoServiceImpl
 * @projectName: boot-dubbo-parent
 * @description: TODO
 * @date 2021/7/9 16:15
 */
//@DubboService(version = "1.0.0") //指定版本后dubbo-admin无法看到消费者的注册信息
@DubboService
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        System.out.println("提供hello服务------"+name);
        return "Hello " + name;
    }
}
