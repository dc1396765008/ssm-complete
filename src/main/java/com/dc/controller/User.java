package com.dc.controller;

import com.dc.bean.UserBean;
import com.dc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class User {
    //    userServiceImp
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public String sayHello(Model model) {
        //需要数据库
        List<UserBean> userBeans = userService.queryAll();
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", userBeans);
        //web-inf/jsp/hello.jsp
        System.out.println("执行了/user");
        return "User";
    }
}