package org.lvsheng.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-name")
public interface FeignApi {

    @GetMapping("/api/resource")
    public String getResource();
}


