package org.rkzl.sync.enums;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 12:12
 * @Description: Metadata Type For Sync Node
 */
public enum MetadataType {

    DB("database"),

    RPC("rpc"),

    MQ("mq"),

    ES("elasticsearch");

    private final String type;

    MetadataType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}