package com.qzing.controller;

import com.qzing.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qzing
 * @ClassName: DemoController
 * @projectName: boot-dubbo-parent
 * @description: TODO
 * @date 2021/7/9 16:44
 */
@Controller
public class DemoController {

    //@DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12346")  指定版本后dubbo-admin无法看到消费者注册信息
    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12346")
    private DemoService demoService;
    @RequestMapping("hello")
    @ResponseBody
    private String hello(@RequestParam String ss){
        return demoService.sayHello("进入消费者："+ss);
    }
}
