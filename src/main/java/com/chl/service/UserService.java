package com.chl.service;

import com.chl.mapper.UserMapper;
import com.chl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chl
 * @date 2020/5/22 21:54
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getAll(){
        return userMapper.getAll();
    }
}
