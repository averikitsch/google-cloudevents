package com.google.events;

/**
 * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
 *
 * Describes the customer-specified mechanism used to store the data at rest.
 */
@lombok.Data
public class CustomerEncryption {
    private String encryptionAlgorithm;
    private String keySha256;
}
