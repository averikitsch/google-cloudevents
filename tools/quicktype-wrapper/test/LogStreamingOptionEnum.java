package io.quicktype;

import java.io.IOException;

public enum LogStreamingOptionEnum {
    STREAM_DEFAULT, STREAM_OFF, STREAM_ON;

    public String toValue() {
        switch (this) {
            case STREAM_DEFAULT: return "STREAM_DEFAULT";
            case STREAM_OFF: return "STREAM_OFF";
            case STREAM_ON: return "STREAM_ON";
        }
        return null;
    }

    public static LogStreamingOptionEnum forValue(String value) throws IOException {
        if (value.equals("STREAM_DEFAULT")) return STREAM_DEFAULT;
        if (value.equals("STREAM_OFF")) return STREAM_OFF;
        if (value.equals("STREAM_ON")) return STREAM_ON;
        throw new IOException("Cannot deserialize LogStreamingOptionEnum");
    }
}
