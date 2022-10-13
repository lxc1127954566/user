package com.linxc.master_campus.user.login.common.enums;

/**
 * 工作类型枚举
 *
 * @author linxc
 */

public enum JobTypeEnum implements EnumInterface{
    FARMING("farming","务农"),
    INDIVIDUAL_MANAGEMENT("individualManagement","个体经营"),
    WORKER("worker","工人");

    private String code;
    private String label;

    JobTypeEnum(String code, String label) {
        this.code = code;
        this.label = label;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
