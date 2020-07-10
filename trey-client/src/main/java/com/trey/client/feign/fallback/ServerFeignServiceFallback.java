package com.trey.client.feign.fallback;

import com.trey.client.feign.ServerFeignService;
import org.springframework.stereotype.Component;

@Component
public class ServerFeignServiceFallback implements ServerFeignService {
    @Override
    public String echo(String str) {
        return "Echo Fallbak.";
    }
}
