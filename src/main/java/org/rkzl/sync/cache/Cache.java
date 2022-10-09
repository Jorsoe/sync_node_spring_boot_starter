package org.rkzl.sync.cache;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.rkzl.sync.enums.MetadataType;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 12:20
 * @Description: Cache Memory
 */
@Data
@NoArgsConstructor
public class Cache {

    /**
     *  Cache default method & variable
     */
    private static volatile Cache instance = null;

    public static Cache singletonInstance() {
        if (instance == null) {
            synchronized (Cache.class) {
                if (instance == null) {
                    instance = new Cache();
                }
            }
        }
        return instance;
    }

    /**
     * Cache memory variable
     */
    private MetadataType sourceType;

    private MetadataType destType;
}