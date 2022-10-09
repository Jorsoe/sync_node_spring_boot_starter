package org.rkzl.sync.service.Impl;

import org.rkzl.sync.service.SyncService;
import org.springframework.stereotype.Component;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 14:40
 * @Description: sync to component
 */
@Component
public class IrdsSyncServiceImpl implements SyncService {

    /**
     * sync person to component
     */
    @Override
    public Integer syncPerson() {
        return 1;
    }
}