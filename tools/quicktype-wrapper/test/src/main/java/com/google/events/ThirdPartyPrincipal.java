package com.google.events;

import java.util.Map;

/**
 * Third party identity as the real authority.
 *
 * Third party identity principal.
 */
@lombok.Data
public class ThirdPartyPrincipal {
    private Map<String, Object> thirdPartyClaims;
}
