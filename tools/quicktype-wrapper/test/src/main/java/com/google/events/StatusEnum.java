package com.google.events;

import java.io.IOException;

public enum StatusEnum {
    CANCELLED, EXPIRED, FAILURE, INTERNAL_ERROR, QUEUED, STATUS_UNKNOWN, SUCCESS, TIMEOUT, WORKING;

    public String toValue() {
        switch (this) {
            case CANCELLED: return "CANCELLED";
            case EXPIRED: return "EXPIRED";
            case FAILURE: return "FAILURE";
            case INTERNAL_ERROR: return "INTERNAL_ERROR";
            case QUEUED: return "QUEUED";
            case STATUS_UNKNOWN: return "STATUS_UNKNOWN";
            case SUCCESS: return "SUCCESS";
            case TIMEOUT: return "TIMEOUT";
            case WORKING: return "WORKING";
        }
        return null;
    }

    public static StatusEnum forValue(String value) throws IOException {
        if (value.equals("CANCELLED")) return CANCELLED;
        if (value.equals("EXPIRED")) return EXPIRED;
        if (value.equals("FAILURE")) return FAILURE;
        if (value.equals("INTERNAL_ERROR")) return INTERNAL_ERROR;
        if (value.equals("QUEUED")) return QUEUED;
        if (value.equals("STATUS_UNKNOWN")) return STATUS_UNKNOWN;
        if (value.equals("SUCCESS")) return SUCCESS;
        if (value.equals("TIMEOUT")) return TIMEOUT;
        if (value.equals("WORKING")) return WORKING;
        throw new IOException("Cannot deserialize StatusEnum");
    }
}
