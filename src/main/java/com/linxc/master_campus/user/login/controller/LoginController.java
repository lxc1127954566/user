package com.linxc.master_campus.user.login.controller;

import com.linxc.master_campus.user.login.common.dto.LoginRequest;
import com.linxc.master_campus.user.login.common.dto.ValidIpCountInTimeRequest;
import com.linxc.master_campus.user.login.common.request.UserLoginRequest;
import com.linxc.master_campus.user.login.common.response.LoginResponse;
import com.linxc.master_campus.user.login.service.LoginService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * 用户登录控制台
 *
 * @author linxc
 */
@RestController
@RequestMapping(value = "login")
@Api(value = "用户登录控制台")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public LoginResponse userLogin(@Valid @RequestBody UserLoginRequest request, HttpServletRequest servletRequest){
        ValidIpCountInTimeRequest validIpCountInTime = new ValidIpCountInTimeRequest();
        validIpCountInTime.setIp(request.getIp());
        loginService.checkLoginIpCountInTime(validIpCountInTime);
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setAccount(request.getAccount());
        loginRequest.setPassword(request.getPassword());
        loginRequest.setPermission(request.getPermission());
        loginService.login(loginRequest);
        return null;
    }
}
