package com.zcz.provider1.controller;

import com.zcz.provider1.service.HealthStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthStatusController {

    @Autowired
    private HealthStatusService healthStatusService;

    @GetMapping("/health")
    public String health(@RequestParam Boolean status) {
        healthStatusService.setStatus(status);
        return healthStatusService.getStatus();
    }

}
