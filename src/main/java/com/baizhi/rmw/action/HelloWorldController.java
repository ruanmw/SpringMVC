package com.baizhi.rmw.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //创建action对象   SpringMVC框架是单例的
@RequestMapping("/hello")  //相当于namespace
public class HelloWorldController {
    /*
    Action的定义语法
    public String 方法名(参数列表) throws Exception
    Localhost:8989/SpringMVC/hello.do
     */
    @RequestMapping(value = "/world",method = {RequestMethod.GET,RequestMethod.POST})
    public String world()throws Exception{
        System.out.println("Hello SpringMVC");
        System.out.println("===========");
        System.out.println("xxxxxxx");
        //跳转index.jsp
        return "index" ;
    }
}
