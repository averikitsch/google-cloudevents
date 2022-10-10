package com.google.events;

import java.io.IOException;

public enum LogLevelEnum {
    DEBUG, ERROR, INFO, LOG_LEVEL_UNSPECIFIED, NONE;

    public String toValue() {
        switch (this) {
            case DEBUG: return "DEBUG";
            case ERROR: return "ERROR";
            case INFO: return "INFO";
            case LOG_LEVEL_UNSPECIFIED: return "LOG_LEVEL_UNSPECIFIED";
            case NONE: return "NONE";
        }
        return null;
    }

    public static LogLevelEnum forValue(String value) throws IOException {
        if (value.equals("DEBUG")) return DEBUG;
        if (value.equals("ERROR")) return ERROR;
        if (value.equals("INFO")) return INFO;
        if (value.equals("LOG_LEVEL_UNSPECIFIED")) return LOG_LEVEL_UNSPECIFIED;
        if (value.equals("NONE")) return NONE;
        throw new IOException("Cannot deserialize LogLevelEnum");
    }
}
