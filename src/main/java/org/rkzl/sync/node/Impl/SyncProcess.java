package org.rkzl.sync.node.Impl;

import org.rkzl.sync.enums.MetadataType;
import org.rkzl.sync.node.Sync;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 12:40
 * @Description: Sync Process
 */
public class SyncProcess<T> extends Sync<T> {

    /**
     * assign source type for data
     *
     * @param type source
     * @return SyncProcess<T>
     */
    @Override
    public Sync<T> sourceType(MetadataType type) {
        return null;
    }

    /**
     * assign destination type for data
     *
     * @param type source
     * @return SyncProcess<T>
     */
    @Override
    public Sync<T> destinationType(MetadataType type) {
        return null;
    }

    /**
     * data sync from database process
     *
     * @return Sync<T>
     */
    @Override
    public Sync<T> database() {
        return null;
    }

    /**
     * data sync from rpc process
     *
     * @return Sync<T>
     */
    @Override
    public Sync<T> rpc() {
        return null;
    }

    /**
     * start process
     *
     * @return Sync<T>
     */
    @Override
    public Sync<T> start() {
        return null;
    }
}