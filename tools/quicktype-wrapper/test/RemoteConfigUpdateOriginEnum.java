package io.quicktype;

import java.io.IOException;

public enum RemoteConfigUpdateOriginEnum {
    ADMIN_Sdk_NODE, CONSOLE, REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED, REST_Api;

    public String toValue() {
        switch (this) {
            case ADMIN_Sdk_NODE: return "ADMIN_SDK_NODE";
            case CONSOLE: return "CONSOLE";
            case REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED: return "REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED";
            case REST_Api: return "REST_API";
        }
        return null;
    }

    public static RemoteConfigUpdateOriginEnum forValue(String value) throws IOException {
        if (value.equals("ADMIN_SDK_NODE")) return ADMIN_Sdk_NODE;
        if (value.equals("CONSOLE")) return CONSOLE;
        if (value.equals("REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED")) return REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED;
        if (value.equals("REST_API")) return REST_Api;
        throw new IOException("Cannot deserialize RemoteConfigUpdateOriginEnum");
    }
}
