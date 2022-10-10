package io.quicktype;

/**
 * A server-stored registry credential used to validate device credentials.
 */
@lombok.Data
public class RegistryCredential {
    private PublicKeyCertificate publicKeyCertificate;
}
