package io.quicktype;

import java.io.IOException;

public enum LogSeverityEnum {
    ALERT, CRITICAL, DEBUG, DEFAULT, EMERGENCY, ERROR, INFO, NOTICE, WARNING;

    public String toValue() {
        switch (this) {
            case ALERT: return "ALERT";
            case CRITICAL: return "CRITICAL";
            case DEBUG: return "DEBUG";
            case DEFAULT: return "DEFAULT";
            case EMERGENCY: return "EMERGENCY";
            case ERROR: return "ERROR";
            case INFO: return "INFO";
            case NOTICE: return "NOTICE";
            case WARNING: return "WARNING";
        }
        return null;
    }

    public static LogSeverityEnum forValue(String value) throws IOException {
        if (value.equals("ALERT")) return ALERT;
        if (value.equals("CRITICAL")) return CRITICAL;
        if (value.equals("DEBUG")) return DEBUG;
        if (value.equals("DEFAULT")) return DEFAULT;
        if (value.equals("EMERGENCY")) return EMERGENCY;
        if (value.equals("ERROR")) return ERROR;
        if (value.equals("INFO")) return INFO;
        if (value.equals("NOTICE")) return NOTICE;
        if (value.equals("WARNING")) return WARNING;
        throw new IOException("Cannot deserialize LogSeverityEnum");
    }
}
