package com.chuxingiao.intern.controller;

import com.chuxingiao.intern.domain.User;
import com.chuxingiao.intern.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : airde
 * @date : 2020/10/19 8:20
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") int id ){
        return this.userService.queryById(id);
    }

}
