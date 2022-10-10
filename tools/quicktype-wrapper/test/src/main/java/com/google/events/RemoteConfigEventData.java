package com.google.events;

import java.time.OffsetDateTime;

/**
 * The data within all Firebase Remote Config events.
 */
@lombok.Data
public class RemoteConfigEventData {
    private String description;
    private Long rollbackSource;
    private RemoteConfigUpdateOrigin updateOrigin;
    private OffsetDateTime updateTime;
    private RemoteConfigUpdateType updateType;
    private User updateUser;
    private Long versionNumber;
}
