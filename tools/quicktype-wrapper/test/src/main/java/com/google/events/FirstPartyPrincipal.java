package com.google.events;

import java.util.Map;

/**
 * First party (Google) identity as the real authority.
 *
 * First party identity principal.
 */
@lombok.Data
public class FirstPartyPrincipal {
    private String principalEmail;
    private Map<String, Object> serviceMetadata;
}
