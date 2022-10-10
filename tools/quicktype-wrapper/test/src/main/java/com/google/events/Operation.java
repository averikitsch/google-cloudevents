package com.google.events;

/**
 * Information about an operation associated with the log entry, if applicable.
 *
 * Additional information about a potentially long-running operation with which a log entry
 * is associated.
 */
@lombok.Data
public class Operation {
    private Boolean first;
    private String id;
    private Boolean last;
    private String producer;
}
