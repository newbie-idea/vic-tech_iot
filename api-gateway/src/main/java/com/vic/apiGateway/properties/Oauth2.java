package com.vic.apiGateway.properties;

import lombok.Data;

@Data
public class Oauth2 {
    private String tokenName = "token";
    private String clientId;
    private String clientSecret;
    private String resourceId;

    private String prefix = "http://oauth2-service/security";
    private String accessTokenApi = "/oauth/token?grant_type=password&username=%s&password=%s";
    private String checkTokenApi = "/oauth/check_token";
}
