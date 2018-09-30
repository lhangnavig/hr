package com.handge.hr.common.enumeration.base;

/**
 * @auther Liujuhao
 * @date 2018/5/21.
 */
public enum ESIndexEnum {
    ALL("00", null),
    MAPPING("01", ""),

    FILTER("02", "_noise");

    private String code;
    private String name;

    ESIndexEnum(String code, String name) {
        this.code = code;
        this.name = name;


    }

    public String getName() {
        return name;
    }
}
