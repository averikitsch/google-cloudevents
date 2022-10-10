package com.google.events;

/**
 * A public key used to verify the signature of JSON Web Tokens (JWTs). When adding a new
 * device credential, either via device creation or via modifications, this public key
 * credential may be required to be signed by one of the registry level certificates. More
 * specifically, if the registry contains at least one certificate, any new device
 * credential must be signed by one of the registry certificates. As a result, when the
 * registry contains certificates, only X.509 certificates are accepted as device
 * credentials. However, if the registry does not contain a certificate, self-signed
 * certificates and public keys will be accepted. New device credentials must be different
 * from every registry-level certificate.
 *
 * A public key format and data.
 */
@lombok.Data
public class PublicKey {
    private PublicKeyFormat format;
    private String key;
}
