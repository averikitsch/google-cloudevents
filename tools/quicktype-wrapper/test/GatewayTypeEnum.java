package io.quicktype;

import java.io.IOException;

public enum GatewayTypeEnum {
    GATEWAY, GATEWAY_TYPE_UNSPECIFIED, NON_GATEWAY;

    public String toValue() {
        switch (this) {
            case GATEWAY: return "GATEWAY";
            case GATEWAY_TYPE_UNSPECIFIED: return "GATEWAY_TYPE_UNSPECIFIED";
            case NON_GATEWAY: return "NON_GATEWAY";
        }
        return null;
    }

    public static GatewayTypeEnum forValue(String value) throws IOException {
        if (value.equals("GATEWAY")) return GATEWAY;
        if (value.equals("GATEWAY_TYPE_UNSPECIFIED")) return GATEWAY_TYPE_UNSPECIFIED;
        if (value.equals("NON_GATEWAY")) return NON_GATEWAY;
        throw new IOException("Cannot deserialize GatewayTypeEnum");
    }
}
