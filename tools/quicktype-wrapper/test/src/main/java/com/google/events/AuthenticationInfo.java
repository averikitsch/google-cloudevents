package com.google.events;

import java.util.List;
import java.util.Map;

/**
 * Authentication information.
 *
 * Authentication information for the operation.
 */
@lombok.Data
public class AuthenticationInfo {
    private String authoritySelector;
    private String principalEmail;
    private String principalSubject;
    private List<ServiceAccountDelegationInfo> serviceAccountDelegationInfo;
    private String serviceAccountKeyName;
    private Map<String, Object> thirdPartyPrincipal;
}
