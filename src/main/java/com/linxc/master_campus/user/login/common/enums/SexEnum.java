package com.linxc.master_campus.user.login.common.enums;

/**
 * 性别枚举
 *
 * @author linxc
 */

public enum SexEnum implements EnumInterface{
    MALE("male","男"),
    FEMALE("female","女");

    private String code;
    private String label;

    SexEnum(String code, String label) {
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
