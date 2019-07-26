package com.zb.demo.controller;


import com.zb.demo.entity.Role;
import com.zb.demo.entity.User;
import com.zb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService us;

    @RequestMapping("/hello")
    public String list(Model model, User user){
        List<User> list=us.findAll(user);
        model.addAttribute("users",list);
        return "list";
    }

    @RequestMapping("/new")
    @ResponseBody
    public int newUser(User user){
        int i=us.newUser(user);
        return i;
    }

    @RequestMapping("/role")
    public String role(Model model){
        List<Role> llst=us.role();
        model.addAttribute("role",llst);
        return "newUser";
    }

    @RequestMapping("66")
    public String pp(){
        return null;
    }
}
