package org.rkzl.sync.node.Impl;

import lombok.extern.slf4j.Slf4j;
import org.rkzl.sync.cache.Cache;
import org.rkzl.sync.enums.MetadataType;
import org.rkzl.sync.node.Sync;

import java.util.function.Supplier;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 12:40
 * @Description: Sync Process
 */
@Slf4j
public class SyncProcess<T> extends Sync<T> {

    private final Cache cache = Cache.singletonInstance();

    public SyncProcess() {
    }

    /**
     * assign source type for data
     *
     * @param type source
     * @return SyncProcess<T>
     */
    @Override
    public Sync<T> sourceType(MetadataType type) {
        cache.setSourceType(type);
        return this;
    }

    /**
     * assign destination type for data
     *
     * @param type source
     * @return SyncProcess<T>
     */
    @Override
    public Sync<T> destinationType(MetadataType type) {
        cache.setDestType(type);
        return this;
    }

    /**
     * data sync from process
     *
     * @return Sync<T>
     */
    @Override
    public Sync<T> process(Supplier<? extends T> supplier) {
        T t = supplier.get();
        log.debug("sync result is : {}", t);
        return this;
    }

    /**
     * start process
     */
    @Override
    public void start() {
    }
}