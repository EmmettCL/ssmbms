package com.zb.demo.service;

import com.zb.demo.dao.UserMapper;
import com.zb.demo.entity.Role;
import com.zb.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper um;

    public List<User> findAll(User user){
        return um.findAll(user);
    }

    public int newUser(User user){
        return um.newUser(user);
    }

    public List<Role> role(){return um.role();}
}
