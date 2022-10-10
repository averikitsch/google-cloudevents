package com.google.events;

import java.io.IOException;

public enum SourceProvenanceHashEnum {
    MD5, NONE, SHA256;

    public String toValue() {
        switch (this) {
            case MD5: return "MD5";
            case NONE: return "NONE";
            case SHA256: return "SHA256";
        }
        return null;
    }

    public static SourceProvenanceHashEnum forValue(String value) throws IOException {
        if (value.equals("MD5")) return MD5;
        if (value.equals("NONE")) return NONE;
        if (value.equals("SHA256")) return SHA256;
        throw new IOException("Cannot deserialize SourceProvenanceHashEnum");
    }
}
