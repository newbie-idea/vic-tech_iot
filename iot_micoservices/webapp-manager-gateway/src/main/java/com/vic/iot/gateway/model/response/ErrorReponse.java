package com.vic.iot.gateway.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vic.iot.gateway.model.ErrorMessage;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorReponse {
    public ErrorReponse() {
    }

    public ErrorReponse(String error, String error_description) {
        this.error = error;
        this.error_description = error_description;
    }


    private String error;
    private String error_description;
    private List<ErrorMessage> messages;
    private Map<String, Object> additionalInfo;
}