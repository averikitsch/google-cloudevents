package com.google.events;

/**
 * Authorization information for the operation.
 */
@lombok.Data
public class AuthorizationInfo {
    private Boolean granted;
    private String permission;
    private String resource;
    private ResourceAttributesClass resourceAttributes;
}
