package io.quicktype;

import java.io.IOException;

public enum NullValueEnum {
    NULL_VALUE;

    public String toValue() {
        switch (this) {
            case NULL_VALUE: return "NULL_VALUE";
        }
        return null;
    }

    public static NullValueEnum forValue(String value) throws IOException {
        if (value.equals("NULL_VALUE")) return NULL_VALUE;
        throw new IOException("Cannot deserialize NullValueEnum");
    }
}
