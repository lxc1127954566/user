package com.linxc.master_campus.user.login.dao.entity;

import com.linxc.master_campus.user.login.common.enums.SexEnum;
import com.linxc.master_campus.user.login.common.model.FamilyInfoModel;
import lombok.Data;

/**
 * 用户详细信息
 *
 * @author linxc
 */
@Data
public class UserInfoEntity {

    private Long id;

    private Long userUUID;

    private String fullName;

    private SexEnum sex;

    private String photosUrl;

    private Long birthDay;

    private FamilyInfoModel parentInfo;

    private String address;
}
