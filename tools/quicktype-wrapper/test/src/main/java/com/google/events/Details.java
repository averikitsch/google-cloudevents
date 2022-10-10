package com.google.events;

import java.time.OffsetDateTime;

/**
 * [Output only] The certificate details. Used only for X.509 certificates.
 *
 * Details of an X.509 certificate. For informational purposes only.
 */
@lombok.Data
public class Details {
    private OffsetDateTime expiryTime;
    private String issuer;
    private String publicKeyType;
    private String signatureAlgorithm;
    private OffsetDateTime startTime;
    private String subject;
}
