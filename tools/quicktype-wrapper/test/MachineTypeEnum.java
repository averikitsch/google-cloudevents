package io.quicktype;

import java.io.IOException;

public enum MachineTypeEnum {
    N1_HIGHCPU_32, N1_HIGHCPU_8, UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case N1_HIGHCPU_32: return "N1_HIGHCPU_32";
            case N1_HIGHCPU_8: return "N1_HIGHCPU_8";
            case UNSPECIFIED: return "UNSPECIFIED";
        }
        return null;
    }

    public static MachineTypeEnum forValue(String value) throws IOException {
        if (value.equals("N1_HIGHCPU_32")) return N1_HIGHCPU_32;
        if (value.equals("N1_HIGHCPU_8")) return N1_HIGHCPU_8;
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        throw new IOException("Cannot deserialize MachineTypeEnum");
    }
}
