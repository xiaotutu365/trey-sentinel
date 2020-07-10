package com.trey.client.feign;

import com.trey.client.feign.fallback.ServerFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "TREY-SERVER", fallback = ServerFeignServiceFallback.class)
public interface ServerFeignService {
    @GetMapping("/echo/{str}")
    String echo(@PathVariable String str);
}