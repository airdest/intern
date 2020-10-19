package com.chuxingiao.intern.service;

import com.chuxingiao.intern.dao.UserMapper;
import com.chuxingiao.intern.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : airde
 * @date : 2020/10/19 8:21
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(long id){

        return this.userMapper.selectByPrimaryKey(id);
    }
}
