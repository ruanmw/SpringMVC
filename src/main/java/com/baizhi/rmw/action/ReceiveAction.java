package com.baizhi.rmw.action;
import com.baizhi.rmw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/receive")
public class ReceiveAction {

    //传统方式收集
    @RequestMapping("/r1")
    public String r1(HttpServletRequest request) throws Exception{
        String username = request.getParameter("username");
        System.out.println(username);

        return "index";
    }

    @RequestMapping("/r2")
    public String r2(String username,Integer age) throws Exception{

        System.out.println(username);
        System.out.println(age);

        return "index";
    }

    @RequestMapping("/r3")
    public String r3(User user) throws Exception{
        System.out.println(user);
        return "index";
    }

    @RequestMapping("/r4")
    public String r4(String[] hobby) throws Exception{
        for (String s : hobby) {
            System.out.println(s);
        }
        return "index";
    }


}
