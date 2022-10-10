package com.google.events;

/**
 * Metadata about the operation.
 *
 * Metadata about the request.
 */
@lombok.Data
public class RequestMetadata {
    private String callerIp;
    private String callerNetwork;
    private String callerSuppliedUserAgent;
    private DestinationAttributes destinationAttributes;
    private Request requestAttributes;
}
