package com.linxc.master_campus.user.login.common.model;

import com.linxc.master_campus.user.login.common.enums.JobTypeEnum;
import com.linxc.master_campus.user.login.common.enums.RelationWithUserEnum;
import com.linxc.master_campus.user.login.common.enums.SexEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 家庭信息模型
 *
 * @author linxc
 */
@Data
public class FamilyInfoModel implements Serializable{
    private static final long serialVersionUID = -4108745508834664809L;

    private List<FolkInfoModel> folks;
}

@Data
class FolkInfoModel implements Serializable {
    private static final long serialVersionUID = -7301678785456029984L;

    private String folkName;

    private SexEnum folkSex;

    private RelationWithUserEnum relation;

    private String phone;

    private JobTypeEnum job;

    private String workUint;
}

