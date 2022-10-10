package com.google.events;

import java.util.Map;

/**
 * Information provided by the client that created the test matrix.
 *
 * Information about the client which invoked the test.
 */
@lombok.Data
public class ClientInfo {
    private String client;
    private Map<String, String> details;
}
