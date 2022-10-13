package com.linxc.master_campus.user.login.common.enums;

public enum UserPermissionEnum implements EnumInterface{
    ;

    private String code;
    private String label;

    UserPermissionEnum(String code, String label) {
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
