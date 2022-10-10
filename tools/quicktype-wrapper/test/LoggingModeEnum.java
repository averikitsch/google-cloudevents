package io.quicktype;

import java.io.IOException;

public enum LoggingModeEnum {
    GCS_ONLY, LEGACY, LOGGING_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case GCS_ONLY: return "GCS_ONLY";
            case LEGACY: return "LEGACY";
            case LOGGING_UNSPECIFIED: return "LOGGING_UNSPECIFIED";
        }
        return null;
    }

    public static LoggingModeEnum forValue(String value) throws IOException {
        if (value.equals("GCS_ONLY")) return GCS_ONLY;
        if (value.equals("LEGACY")) return LEGACY;
        if (value.equals("LOGGING_UNSPECIFIED")) return LOGGING_UNSPECIFIED;
        throw new IOException("Cannot deserialize LoggingModeEnum");
    }
}
