package io.quicktype;

/**
 * A public key certificate used to verify the device credentials.
 *
 * A public key certificate format and data.
 */
@lombok.Data
public class PublicKeyCertificate {
    private String certificate;
    private PublicKeyCertificateFormat format;
    private Details x509Details;
}
