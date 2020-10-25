package com.eh.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "eh.hello")
@Data
public class HelloProperties {
    private String prefix;
    private String suffix;
}
