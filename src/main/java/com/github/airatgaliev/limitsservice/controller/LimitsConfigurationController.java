package com.github.airatgaliev.limitsservice.controller;

import com.github.airatgaliev.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

  @Value("${limits-service.maximum}")
  private int maximum;
  @Value("${limits-service.minimum}")
  private int minimum;

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfiguration() {
    return new LimitConfiguration(maximum, minimum);
  }
}
