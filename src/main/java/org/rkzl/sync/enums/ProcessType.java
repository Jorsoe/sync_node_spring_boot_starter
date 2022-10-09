package org.rkzl.sync.enums;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 14:25
 * @Description: Process Type For Sync Node
 */
public enum ProcessType {

    HIKVISION_IRDS("hikvision_irds"),

    OTHER_COMPONENT("other_component");

    private final String type;

    ProcessType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}