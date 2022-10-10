package io.quicktype;

import java.io.IOException;

public enum PublicKeyFormatEnum {
    ES256_PEM, ES256_X509_PEM, RSA_PEM, RSA_X509_PEM, UNSPECIFIED_PUBLIC_KEY_FORMAT;

    public String toValue() {
        switch (this) {
            case ES256_PEM: return "ES256_PEM";
            case ES256_X509_PEM: return "ES256_X509_PEM";
            case RSA_PEM: return "RSA_PEM";
            case RSA_X509_PEM: return "RSA_X509_PEM";
            case UNSPECIFIED_PUBLIC_KEY_FORMAT: return "UNSPECIFIED_PUBLIC_KEY_FORMAT";
        }
        return null;
    }

    public static PublicKeyFormatEnum forValue(String value) throws IOException {
        if (value.equals("ES256_PEM")) return ES256_PEM;
        if (value.equals("ES256_X509_PEM")) return ES256_X509_PEM;
        if (value.equals("RSA_PEM")) return RSA_PEM;
        if (value.equals("RSA_X509_PEM")) return RSA_X509_PEM;
        if (value.equals("UNSPECIFIED_PUBLIC_KEY_FORMAT")) return UNSPECIFIED_PUBLIC_KEY_FORMAT;
        throw new IOException("Cannot deserialize PublicKeyFormatEnum");
    }
}
