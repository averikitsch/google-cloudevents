package io.quicktype;

import java.io.IOException;

public enum HTTPStateEnum {
    HTTP_DISABLED, HTTP_ENABLED, HTTP_STATE_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case HTTP_DISABLED: return "HTTP_DISABLED";
            case HTTP_ENABLED: return "HTTP_ENABLED";
            case HTTP_STATE_UNSPECIFIED: return "HTTP_STATE_UNSPECIFIED";
        }
        return null;
    }

    public static HTTPStateEnum forValue(String value) throws IOException {
        if (value.equals("HTTP_DISABLED")) return HTTP_DISABLED;
        if (value.equals("HTTP_ENABLED")) return HTTP_ENABLED;
        if (value.equals("HTTP_STATE_UNSPECIFIED")) return HTTP_STATE_UNSPECIFIED;
        throw new IOException("Cannot deserialize HTTPStateEnum");
    }
}
