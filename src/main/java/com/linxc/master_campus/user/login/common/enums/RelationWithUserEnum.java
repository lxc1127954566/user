package com.linxc.master_campus.user.login.common.enums;

/**
 * 家庭关系枚举
 *
 * @author linxc
 */

public enum RelationWithUserEnum implements EnumInterface{
    MOTHER("mother","母亲"),
    FATHER("father","父亲"),
    GRANDMOTHER("grandmother","祖母"),
    GRANDFATHER("grandfather","祖父"),
    SISTER("sister","姐妹"),
    BROTHER("brother","兄弟");

    private String code;
    private String label;

    RelationWithUserEnum(String code, String label) {
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
