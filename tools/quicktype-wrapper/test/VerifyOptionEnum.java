package io.quicktype;

import java.io.IOException;

public enum VerifyOptionEnum {
    NOT_VERIFIED, VERIFIED;

    public String toValue() {
        switch (this) {
            case NOT_VERIFIED: return "NOT_VERIFIED";
            case VERIFIED: return "VERIFIED";
        }
        return null;
    }

    public static VerifyOptionEnum forValue(String value) throws IOException {
        if (value.equals("NOT_VERIFIED")) return NOT_VERIFIED;
        if (value.equals("VERIFIED")) return VERIFIED;
        throw new IOException("Cannot deserialize VerifyOptionEnum");
    }
}
