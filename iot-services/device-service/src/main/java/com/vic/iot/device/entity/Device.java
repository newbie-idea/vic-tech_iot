package com.vic.iot.device.entity;

import com.vic.iot.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@Document(collection = "device")
public class Device extends BaseEntity {
    @Id
    private String deviceId = UUID.randomUUID().toString();
    private String name;
    private String mac;
    private String tags;
    private String type;
    private String status;
    private String description;

    private String supplierId;

    private Map components;
    private Map deviceInfo;
    private Map serviceStatus;

}
