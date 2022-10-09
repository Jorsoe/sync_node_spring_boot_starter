package org.rkzl.sync.config;

import org.rkzl.sync.node.Impl.SyncProcess;
import org.rkzl.sync.node.Sync;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 12:27
 * @Description: Sync Process Auto Configuration
 */
public class SyncProcessAutoConfiguration {

    @Bean
    public Sync syncProcess() {
        return new SyncProcess();
    }
}