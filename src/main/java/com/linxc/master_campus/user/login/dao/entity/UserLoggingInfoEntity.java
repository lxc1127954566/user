package com.linxc.master_campus.user.login.dao.entity;

import com.linxc.master_campus.user.login.common.enums.UserPermissionEnum;
import lombok.Data;

/**
 * 用户登录信息
 *
 * @author linxc
 */

@Data
public class UserLoggingInfoEntity {

    private Long userUUID;

    private String password;

    private UserPermissionEnum permission;

    private Long createDate;

    private Long lastLoggingDate;
}
