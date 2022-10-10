package io.quicktype;

import java.io.IOException;

public enum TestStateEnum {
    ERROR, FINISHED, INVALID, PENDING, TEST_STATE_UNSPECIFIED, VALIDATING;

    public String toValue() {
        switch (this) {
            case ERROR: return "ERROR";
            case FINISHED: return "FINISHED";
            case INVALID: return "INVALID";
            case PENDING: return "PENDING";
            case TEST_STATE_UNSPECIFIED: return "TEST_STATE_UNSPECIFIED";
            case VALIDATING: return "VALIDATING";
        }
        return null;
    }

    public static TestStateEnum forValue(String value) throws IOException {
        if (value.equals("ERROR")) return ERROR;
        if (value.equals("FINISHED")) return FINISHED;
        if (value.equals("INVALID")) return INVALID;
        if (value.equals("PENDING")) return PENDING;
        if (value.equals("TEST_STATE_UNSPECIFIED")) return TEST_STATE_UNSPECIFIED;
        if (value.equals("VALIDATING")) return VALIDATING;
        throw new IOException("Cannot deserialize TestStateEnum");
    }
}
