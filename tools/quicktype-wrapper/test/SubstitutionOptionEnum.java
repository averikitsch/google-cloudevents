package io.quicktype;

import java.io.IOException;

public enum SubstitutionOptionEnum {
    ALLOW_LOOSE, MUST_MATCH;

    public String toValue() {
        switch (this) {
            case ALLOW_LOOSE: return "ALLOW_LOOSE";
            case MUST_MATCH: return "MUST_MATCH";
        }
        return null;
    }

    public static SubstitutionOptionEnum forValue(String value) throws IOException {
        if (value.equals("ALLOW_LOOSE")) return ALLOW_LOOSE;
        if (value.equals("MUST_MATCH")) return MUST_MATCH;
        throw new IOException("Cannot deserialize SubstitutionOptionEnum");
    }
}
