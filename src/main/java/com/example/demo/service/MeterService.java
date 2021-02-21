package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MeterService {
    private long startTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        log.info("Operation took {} ms", System.currentTimeMillis() - startTime);
    }
}
