package com.vic.iot.mqtt.handler;

import com.vic.iot.mqtt.model.DevicePayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DeviceMessageHandler {


    public void handleMessage(DevicePayload devicePayload) {
        log.info("Persisting {}", devicePayload);
    }
}
