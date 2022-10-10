package com.google.events;

/**
 * Container message for hash values.
 */
@lombok.Data
public class Hash {
    private HashType type;
    private String value;
}
