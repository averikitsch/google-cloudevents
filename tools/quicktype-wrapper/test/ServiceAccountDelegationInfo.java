package io.quicktype;

/**
 * Identity delegation history of an authenticated service account.
 */
@lombok.Data
public class ServiceAccountDelegationInfo {
    private FirstPartyPrincipal firstPartyPrincipal;
    private ThirdPartyPrincipal thirdPartyPrincipal;
}
