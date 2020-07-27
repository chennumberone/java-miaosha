package com.chl.controller;

import com.chl.redis.RedisService;
import com.chl.result.Result;
import com.chl.service.MiaoshaUserService;
import com.chl.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author chl
 * @date 2020/5/24 14:52
 */
@Controller
@RequestMapping("login")
public class LoginController {

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("to_login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("do_login")
    @ResponseBody
    public Result<Boolean> doLogin(HttpServletResponse response, @Valid LoginVo loginVo) {
        log.info(loginVo.toString());
        //登录
        userService.login(response, loginVo);
        return Result.success(true);
    }
}
