package com.trey.client.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SentinelConfig {
    public SentinelConfig() {
        WebCallbackManager.setUrlBlockHandler((request, response, e) -> {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", "200");
            jsonObject.put("msg", "success");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            response.getWriter().write(JSON.toJSONString(jsonObject));
        });
    }
}