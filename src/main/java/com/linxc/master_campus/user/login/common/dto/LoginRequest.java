package com.linxc.master_campus.user.login.common.dto;

import com.linxc.master_campus.user.login.common.enums.UserPermissionEnum;
import lombok.Data;

/**
 * @author linxc
 */
@Data
public class LoginRequest {
    private Long account;
    private String password;
    private UserPermissionEnum permission;
    private String ip;
    /**
     * 1分钟内访问次数超过5次暂停次ip访问
     * */
    private String count;
}
