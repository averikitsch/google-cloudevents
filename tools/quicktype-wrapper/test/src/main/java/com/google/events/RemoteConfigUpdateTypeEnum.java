package com.google.events;

import java.io.IOException;

public enum RemoteConfigUpdateTypeEnum {
    FORCED_UPDATE, INCREMENTAL_UPDATE, REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED, ROLLBACK;

    public String toValue() {
        switch (this) {
            case FORCED_UPDATE: return "FORCED_UPDATE";
            case INCREMENTAL_UPDATE: return "INCREMENTAL_UPDATE";
            case REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED: return "REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED";
            case ROLLBACK: return "ROLLBACK";
        }
        return null;
    }

    public static RemoteConfigUpdateTypeEnum forValue(String value) throws IOException {
        if (value.equals("FORCED_UPDATE")) return FORCED_UPDATE;
        if (value.equals("INCREMENTAL_UPDATE")) return INCREMENTAL_UPDATE;
        if (value.equals("REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED")) return REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED;
        if (value.equals("ROLLBACK")) return ROLLBACK;
        throw new IOException("Cannot deserialize RemoteConfigUpdateTypeEnum");
    }
}
