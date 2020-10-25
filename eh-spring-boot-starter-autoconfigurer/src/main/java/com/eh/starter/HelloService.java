package com.eh.starter;

import lombok.Setter;

public class HelloService {
    @Setter
    private HelloProperties helloProperties;

    public String sayHello(String name) {
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }
}
