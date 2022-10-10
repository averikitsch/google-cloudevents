package io.quicktype;

/**
 * User's info at the identity provider
 */
@lombok.Data
public class UserInfo {
    private String displayName;
    private String email;
    private String photoUrl;
    private String providerId;
    private String uid;
}
