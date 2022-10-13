package com.linxc.master_campus.user.login.common.request;

import com.linxc.master_campus.user.login.common.enums.UserPermissionEnum;
import com.linxc.master_campus.user.login.common.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 用户登录请求模块
 *
 * @author linxc
 */
@Data
public class UserLoginRequest {

    @ApiModelProperty(value = "账号")
    @NotNull(message = ErrorCode.THE_ACCOUNT_CANNOT_EMPTY)
    private Long account;

    @ApiModelProperty(value = "密码")
    @NotEmpty(message = ErrorCode.THE_PASSWORD_CANNOT_EMPTY)
    private String password;

    @ApiModelProperty(value = "权限")
    @NotNull(message = ErrorCode.THE_PERMISSION_CANNOT_EMPTY)
    private UserPermissionEnum permission;

    @ApiModelProperty(value = "ip")
    @NotNull(message = ErrorCode.THE_IP_CANNOT_EMPTY)
    private String ip;
}
