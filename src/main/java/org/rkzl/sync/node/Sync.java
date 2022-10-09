package org.rkzl.sync.node;

import org.rkzl.sync.enums.MetadataType;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 12:18
 * @Description: Sync Process
 */
public abstract class Sync<T> {

    /**
     * assign source type for data
     *
     * @param type source
     * @return Sync<T>
     */
    public abstract Sync<T> sourceType(MetadataType type);

    /**
     * assign destination type for data
     *
     * @param type source
     * @return Sync<T>
     */
    public abstract Sync<T> destinationType(MetadataType type);

    /**
     * data sync from database process
     *
     * @return Sync<T>
     */
    public abstract Sync<T> database();

    /**
     * data sync from rpc process
     *
     * @return Sync<T>
     */
    public abstract Sync<T> rpc();

    /**
     * start process
     *
     * @return Sync<T>
     */
    public abstract Sync<T> start();

}