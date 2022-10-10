package com.google.events;

import java.io.IOException;

public enum PublicKeyCertificateFormatEnum {
    UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT, X509_CERTIFICATE_PEM;

    public String toValue() {
        switch (this) {
            case UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT: return "UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT";
            case X509_CERTIFICATE_PEM: return "X509_CERTIFICATE_PEM";
        }
        return null;
    }

    public static PublicKeyCertificateFormatEnum forValue(String value) throws IOException {
        if (value.equals("UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT")) return UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT;
        if (value.equals("X509_CERTIFICATE_PEM")) return X509_CERTIFICATE_PEM;
        throw new IOException("Cannot deserialize PublicKeyCertificateFormatEnum");
    }
}
