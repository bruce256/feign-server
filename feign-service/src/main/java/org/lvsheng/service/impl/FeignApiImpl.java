package org.lvsheng.service.impl;

import org.lvsheng.api.FeignApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignApiImpl implements FeignApi {

    @Override
    public String getResource() {
        return "lvsheng test";
    }
}
