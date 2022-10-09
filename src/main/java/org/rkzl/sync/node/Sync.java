package org.rkzl.sync.node;

import org.rkzl.sync.enums.MetadataType;

import java.util.function.Supplier;

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
     * data sync from process
     *
     * @return Sync<T>
     */
    public abstract Sync<T> process(Supplier<? extends T> supplier);

    /**
     * start process
     *
     */
    public abstract void start();

}