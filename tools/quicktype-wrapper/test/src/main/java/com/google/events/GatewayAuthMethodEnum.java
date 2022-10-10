package com.google.events;

import java.io.IOException;

public enum GatewayAuthMethodEnum {
    ASSOCIATION_AND_DEVICE_AUTH_TOKEN, ASSOCIATION_ONLY, DEVICE_AUTH_TOKEN_ONLY, GATEWAY_AUTH_METHOD_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case ASSOCIATION_AND_DEVICE_AUTH_TOKEN: return "ASSOCIATION_AND_DEVICE_AUTH_TOKEN";
            case ASSOCIATION_ONLY: return "ASSOCIATION_ONLY";
            case DEVICE_AUTH_TOKEN_ONLY: return "DEVICE_AUTH_TOKEN_ONLY";
            case GATEWAY_AUTH_METHOD_UNSPECIFIED: return "GATEWAY_AUTH_METHOD_UNSPECIFIED";
        }
        return null;
    }

    public static GatewayAuthMethodEnum forValue(String value) throws IOException {
        if (value.equals("ASSOCIATION_AND_DEVICE_AUTH_TOKEN")) return ASSOCIATION_AND_DEVICE_AUTH_TOKEN;
        if (value.equals("ASSOCIATION_ONLY")) return ASSOCIATION_ONLY;
        if (value.equals("DEVICE_AUTH_TOKEN_ONLY")) return DEVICE_AUTH_TOKEN_ONLY;
        if (value.equals("GATEWAY_AUTH_METHOD_UNSPECIFIED")) return GATEWAY_AUTH_METHOD_UNSPECIFIED;
        throw new IOException("Cannot deserialize GatewayAuthMethodEnum");
    }
}
