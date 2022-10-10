package io.quicktype;

import java.time.OffsetDateTime;

/**
 * A server-stored device credential used for authentication.
 */
@lombok.Data
public class DeviceCredential {
    private OffsetDateTime expirationTime;
    private PublicKey publicKey;
}
