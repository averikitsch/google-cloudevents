package io.quicktype;

import java.util.List;
import java.util.Map;

/**
 * The request authentication. May be absent for unauthenticated requests. Derived from the
 * HTTP request `Authorization` header or equivalent.
 *
 * This message defines request authentication attributes. Terminology is based on the JSON
 * Web Token (JWT) standard, but the terms also correlate to concepts in other standards.
 */
@lombok.Data
public class Auth {
    private List<String> accessLevels;
    private List<String> audiences;
    private Map<String, Object> claims;
    private String presenter;
    private String principal;
}
