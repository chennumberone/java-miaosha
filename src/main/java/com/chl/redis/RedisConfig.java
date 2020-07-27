package com.chl.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author chl
 * @date 2020/5/23 9:43
 */
@Data
@Component
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {
    private String host;
    private int port;
    private int timeout;//秒
    private int poolMaxTotal;
    private int poolMaxIdle;
    private int poolMaxWait;//秒
}
