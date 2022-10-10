package com.google.events;

import java.util.List;
import java.util.Map;

/**
 * The data within all Firebase Auth events.
 */
@lombok.Data
public class AuthEventData {
    private Map<String, Object> customClaims;
    private Boolean disabled;
    private String displayName;
    private String email;
    private Boolean emailVerified;
    private Metadata metadata;
    private String phoneNumber;
    private String photoUrl;
    private List<UserInfo> providerData;
    private String uid;
}
