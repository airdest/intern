package com.chuxingiao.intern.dao;

import com.chuxingiao.intern.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author : airde
 * @date : 2020/10/19 8:26
 */
@Mapper
@Component
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
