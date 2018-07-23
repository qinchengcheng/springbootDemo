package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 16:46
 */
@Controller
public class HelloController {
//    @Value("${name}")
//    private String name;
//    @Value("${age}")
//    private String age;

    @RequestMapping("/hello")
    public String hello(Model m) {
        return "hello";
    }
}