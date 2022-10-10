package io.quicktype;

import java.util.Map;

/**
 * Pairs a set of secret environment variables containing encrypted values with the Cloud
 * KMS key to use to decrypt the value.
 */
@lombok.Data
public class Secret {
    private String kmsKeyName;
    private Map<String, String> secretEnv;
}
