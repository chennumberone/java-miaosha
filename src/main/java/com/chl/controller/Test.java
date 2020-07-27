package com.chl.controller;

import com.chl.pojo.User;
import com.chl.redis.RedisService;
import com.chl.redis.UserKey;
import com.chl.result.Result;
import com.chl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author chl
 * @date 2020/5/22 21:38
 */
@Controller
public class Test {
    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("test")
    @ResponseBody
    public List<User> test(){
        List<User> all = userService.getAll();
        return all;
    }

    @RequestMapping("/redis/set")
    @ResponseBody
    public Result<Boolean> redisSet() {
        User user  = new User();
        user.setUsername("jack");
        user.setPassword("1111");
        redisService.set(UserKey.getByUsername, ""+1, user);//UserKey:id1
        return Result.success(true);
    }
}
