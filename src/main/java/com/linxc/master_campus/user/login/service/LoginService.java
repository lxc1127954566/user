package com.linxc.master_campus.user.login.service;

import com.linxc.master_campus.user.login.common.dto.LoginRequest;
import com.linxc.master_campus.user.login.common.dto.ValidIpCountInTimeRequest;

/**
 * 登录业务
 *
 * @author linxc
 */
public interface LoginService {

    /**
     * 登录
     *
     * @param request
     * @return
     * */
    void login(LoginRequest request);

    /**
     * 校验登录次数
     *
     * @param request
     * @return
     * */
    void checkLoginIpCountInTime(ValidIpCountInTimeRequest request);
}
